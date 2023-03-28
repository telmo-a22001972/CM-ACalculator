package com.example.acalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acalculator.databinding.FragmentCalculatorBinding


class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding
    private val TAG = MainActivity::class.java.simpleName
    private var calculator = Calculator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_calculator, container, false)
        binding = FragmentCalculatorBinding.bind(view)
        return binding.root
    }


    override fun onStart() {
        super.onStart()

        binding.button1.setOnClickListener{
            Log.i(TAG, "Click no botão 1")
            calculator.addSymbol("1")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button2.setOnClickListener{
            Log.i(TAG, "Click no botão 2")
            calculator.addSymbol("2")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonAdition.setOnClickListener {
            Log.i(TAG, "Click no botão +")
            calculator.addSymbol("+")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonEquals.setOnClickListener {
            Log.i(TAG, "Click no botão =")
            calculator.equals()
            Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
            binding.textVisor.text = calculator.getExpression()
        }


        binding.buttonClear.setOnClickListener {
            Log.i(TAG, "Click no botão C")
            calculator.clear()
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonBackspace.setOnClickListener {
            Log.i(TAG, "Click no botão <")
            calculator.backspace()
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonDivision.setOnClickListener {
            Log.i(TAG, "Click no botão /")
            calculator.addSymbol("/")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonMultiplication.setOnClickListener {
            Log.i(TAG, "Click no botão *")
            calculator.addSymbol("*")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonSubtraction.setOnClickListener {
            Log.i(TAG, "Click no botão -")
            calculator.addSymbol("-")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            calculator.addSymbol("3")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button4.setOnClickListener {
            Log.i(TAG, "Click no botão 4")
            calculator.addSymbol("4")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button5.setOnClickListener {
            Log.i(TAG, "Click no botão 5")
            calculator.addSymbol("5")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button6.setOnClickListener {
            Log.i(TAG, "Click no botão 6")
            calculator.addSymbol("6")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button7.setOnClickListener {
            Log.i(TAG, "Click no botão 7")
            calculator.addSymbol("7")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button8.setOnClickListener {
            Log.i(TAG, "Click no botão 8")
            calculator.addSymbol("8")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button9.setOnClickListener {
            Log.i(TAG, "Click no botão 9")
            calculator.addSymbol("9")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.button0.setOnClickListener {
            Log.i(TAG, "Click no botão 0")
            calculator.addSymbol("0")
            binding.textVisor.text = calculator.getExpression()
        }

        binding.buttonComma.setOnClickListener {
            Log.i(TAG, "Click no botão ,")
            calculator.addSymbol(".")
            binding.textVisor.text = calculator.getExpression()
        }


    }

}