package com.example.acalculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.acalculator.databinding.ItemExpressionBinding

class HistoryAdapter(private val onOperationClick: (String) -> Unit ,private var items : List<OperationUI> = listOf()) :
RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>(){

    class HistoryViewHolder(val binding : ItemExpressionBinding) :
    RecyclerView.ViewHolder(binding.root)

    // Implementação do HistoryAdapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
    HistoryViewHolder {
        return HistoryViewHolder(
            ItemExpressionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.itemView.setOnClickListener { onOperationClick(items[position].operation) }
        holder.binding.textExpression.text = items[position].operation
        holder.binding.textResult.text = items[position].result
    }

    override fun getItemCount() = items.size

    fun updateItems(newItems : List<OperationUI>) {
        items = newItems
        notifyDataSetChanged()
    }
}