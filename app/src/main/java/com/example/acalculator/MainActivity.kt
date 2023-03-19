package com.example.acalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.acalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.button1.setOnClickListener{
            Log.i(TAG, "Click no botão 1")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "1"
            } else {
                binding.textVisor.append("1")
            }
        }

        binding.button2.setOnClickListener{
            Log.i(TAG, "Click no botão 2")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "2"
            } else {
                binding.textVisor.append("2")
            }
        }

        binding.buttonAdition.setOnClickListener {
            Log.i(TAG, "Click no botão +")
            binding.textVisor.append("+")
        }

        binding.buttonEquals.setOnClickListener {
            Log.i(TAG, "Click no botão =")
            val expression = ExpressionBuilder(
                binding.textVisor.text.toString()
            ).build()
            binding.textVisor.text = expression.evaluate().toString()
            Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
        }


        binding.buttonClear.setOnClickListener {
            Log.i(TAG, "Click no botão C")
            binding.textVisor.text = "0"
        }

        binding.buttonBackspace.setOnClickListener {
            Log.i(TAG, "Click no botão <")
            val text = binding.textVisor.text.toString()
            if (text.isNotEmpty()) {
                binding.textVisor.text = text.substring(0, text.length - 1)
            }
            if (text.isEmpty()) {
                binding.textVisor.text = "0"
            }
        }

        binding.buttonDivision.setOnClickListener {
            Log.i(TAG, "Click no botão /")
            binding.textVisor.append("/")
        }

        binding.buttonMultiplication.setOnClickListener {
            Log.i(TAG, "Click no botão *")
            binding.textVisor.append("*")
        }

        binding.buttonSubtraction.setOnClickListener {
            Log.i(TAG, "Click no botão -")
            binding.textVisor.append("-")
        }

        binding.button3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "3"
            } else {
                binding.textVisor.append("3")
            }
        }

        binding.button4.setOnClickListener {
            Log.i(TAG, "Click no botão 4")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "4"
            } else {
                binding.textVisor.append("4")
            }
        }

        binding.button5.setOnClickListener {
            Log.i(TAG, "Click no botão 5")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "5"
            } else {
                binding.textVisor.append("5")
            }
        }

        binding.button6.setOnClickListener {
            Log.i(TAG, "Click no botão 6")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "6"
            } else {
                binding.textVisor.append("6")
            }
        }

        binding.button7.setOnClickListener {
            Log.i(TAG, "Click no botão 7")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "7"
            } else {
                binding.textVisor.append("7")
            }
        }

        binding.button8.setOnClickListener {
            Log.i(TAG, "Click no botão 8")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "8"
            } else {
                binding.textVisor.append("8")
            }
        }

        binding.button9.setOnClickListener {
            Log.i(TAG, "Click no botão 9")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "9"
            } else {
                binding.textVisor.append("9")
            }
        }

        binding.button0.setOnClickListener {
            Log.i(TAG, "Click no botão 0")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "0"
            } else {
                binding.textVisor.append("0")
            }
        }


    }
}