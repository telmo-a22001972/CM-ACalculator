package com.example.acalculator

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

object Calculator {
    private val _operationsHistory = mutableListOf<OperationUI>(
        OperationUI("1+1","2"), OperationUI("2+2", "4")
    )

    val history get() = _operationsHistory.toList()

    fun getHistory(onFinished: (List<OperationUI>) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            onFinished(history.toList())
        }
    }
    private var expression = "0"

    fun getExpression(): String {
        return expression
    }

    fun getLastOperation(): OperationUI {
        return history.last()
    }

    fun getOperationsHistory(): List<OperationUI> {
        return history
    }

    fun addSymbol(symbol: String) {
        if (expression == "0") {
            expression = symbol
        } else {
            expression += symbol
        }
    }

    fun clear() {
        expression = "0"
    }

    fun backspace() {
        val text = expression
        if (text.isNotEmpty()) {
            expression = text.substring(0, text.length - 1)
        }
        if (text.isEmpty()) {
            expression = "0"
        }
    }

    fun equals() {
        val operation = ExpressionBuilder(
            expression
        ).build()
        CoroutineScope(Dispatchers.IO).launch {
            addToHistory(expression, operation)
        }
        expression = operation.evaluate().toString()
    }

    suspend fun addToHistory(expression: String, operation: Expression) {
        _operationsHistory.add(OperationUI(Calculator.expression, operation.evaluate().toString()))
        Log.i("Calculator", "addToHistory: ${history.last()}")
    }


}