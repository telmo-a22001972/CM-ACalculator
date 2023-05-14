package com.example.acalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acalculator.databinding.FragmentCalculatorBinding
import com.example.acalculator.databinding.FragmentHistoryBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HistoryFragment : Fragment() {
    private lateinit var binding : FragmentHistoryBinding
    private val TAG = MainActivity::class.java.simpleName
    //private val calculator = Calculator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_history, container, false)
        binding = FragmentHistoryBinding.bind(view)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val builder = StringBuilder()
        /*
        val history = Calculator.getOperationsHistory()
        Log.i(TAG, "O histórico de operações é $history")
        history.forEach {builder.append("${it.operation}=${it.result}\n")}
        binding.tvHistory.text = builder.toString()

         */

        val history = Calculator.getHistory({ history ->
            CoroutineScope(Dispatchers.Main).launch {
                Log.i(TAG, "O histórico de operações é $history")
                history.forEach {builder.append("${it.operation}=${it.result}\n")}
                binding.tvHistory.text = builder.toString()
            }
        })

    }


}