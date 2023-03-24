package com.example.acalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.acalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.simpleName
    private var operationsHistory = mutableListOf<String>()

    fun addSymbol(symbol: String) {
        if (binding.textVisor.text.toString() == "0") {
            binding.textVisor.text = symbol
        } else {
            binding.textVisor.append(symbol)
        }
    }

    fun clear() {
        binding.textVisor.text = "0"
    }

    fun backspace() {
        val text = binding.textVisor.text.toString()
        if (text.isNotEmpty()) {
            binding.textVisor.text = text.substring(0, text.length - 1)
        }
        if (text.isEmpty()) {
            binding.textVisor.text = "0"
        }
    }

    fun equals() {
        val expression = ExpressionBuilder(
            binding.textVisor.text.toString()
        ).build()
        binding.textVisor.text = expression.evaluate().toString()
        Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        binding.button1.setOnClickListener{
            Log.i(TAG, "Click no botão 1")
            addSymbol("1")
        }

        binding.button2.setOnClickListener{
            Log.i(TAG, "Click no botão 2")
            addSymbol("2")
        }

        binding.buttonAdition.setOnClickListener {
            Log.i(TAG, "Click no botão +")
            addSymbol("+")
        }

        binding.buttonEquals.setOnClickListener {
            Log.i(TAG, "Click no botão =")
            equals()
            Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
        }


        binding.buttonClear.setOnClickListener {
            Log.i(TAG, "Click no botão C")
            clear()
        }

        binding.buttonBackspace.setOnClickListener {
            Log.i(TAG, "Click no botão <")
            backspace()
        }

        binding.buttonDivision.setOnClickListener {
            Log.i(TAG, "Click no botão /")
            addSymbol("/")
        }

        binding.buttonMultiplication.setOnClickListener {
            Log.i(TAG, "Click no botão *")
            addSymbol("*")
        }

        binding.buttonSubtraction.setOnClickListener {
            Log.i(TAG, "Click no botão -")
            addSymbol("-")
        }

        binding.button3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            addSymbol("3")
        }

        binding.button4.setOnClickListener {
            Log.i(TAG, "Click no botão 4")
            addSymbol("4")
        }

        binding.button5.setOnClickListener {
            Log.i(TAG, "Click no botão 5")
            addSymbol("5")
        }

        binding.button6.setOnClickListener {
            Log.i(TAG, "Click no botão 6")
            addSymbol("6")
        }

        binding.button7.setOnClickListener {
            Log.i(TAG, "Click no botão 7")
            addSymbol("7")
        }

        binding.button8.setOnClickListener {
            Log.i(TAG, "Click no botão 8")
            addSymbol("8")
        }

        binding.button9.setOnClickListener {
            Log.i(TAG, "Click no botão 9")
            addSymbol("9")
        }

        binding.button0.setOnClickListener {
            Log.i(TAG, "Click no botão 0")
            addSymbol("0")
        }

        binding.buttonComma.setOnClickListener {
            Log.i(TAG, "Click no botão ,")
            addSymbol(".")
        }


    }
}