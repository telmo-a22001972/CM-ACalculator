package com.example.acalculator

import android.util.Log
import net.objecthunter.exp4j.ExpressionBuilder

class Calculator {
    private var operationsHistory = mutableListOf<OperationUI>()
    private var expression = "0"

    fun getExpression(): String {
        return expression
    }

    fun getLastOperation(): OperationUI {
        return operationsHistory.last()
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
        operationsHistory.add(OperationUI(expression, operation.evaluate().toString()))
        expression = operation.evaluate().toString()
    }


}