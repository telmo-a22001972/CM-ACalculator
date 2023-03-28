package com.example.acalculator

class OperationUI(var operation: String, var result: String) {
    var date: Long = System.currentTimeMillis()

    override fun toString(): String {
        return "OperationUI(operation='${operation}', result='$result', date=$date)"
    }


}