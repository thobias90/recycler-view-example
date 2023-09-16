package com.stahlt.recycler_view_example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stahlt.recycler_view_example.R
import com.stahlt.recycler_view_example.model.Phrase

class ItemAdapter(private val context: Context, private val phrases: List<Phrase>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView
        init {
            tvTitle = view.findViewById(R.id.tvTitle)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_element, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phrases.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = phrases[position].toString()
    }
}