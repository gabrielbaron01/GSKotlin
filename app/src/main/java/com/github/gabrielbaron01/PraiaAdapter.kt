package com.github.gabrielbaron01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PraiaAdapter : RecyclerView.Adapter<PraiaAdapter.ItemViewHolder>() {

    private val praias = mutableListOf<PraiaModel>()

    fun adicionarPraia(newPraia: PraiaModel) {
        praias.add(newPraia)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = praias.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val praia = praias[position]
        holder.bind(praia)
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textViewItem)
        fun bind(praia: PraiaModel) {
            textView.text = praia.nome
            textView.text = praia.cidade
            textView.text = praia.estado
        }
    }
}