package com.example.todolisttasksproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todolisttasksproject.R
import com.example.todolisttasksproject.model.Task

class ItemAdapter(

    private val context: Context,
    private val dataset: List<Task>
    ) :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()

{


    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){

       val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_title, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringRecourceId)

    }

    override fun getItemCount():Int{

        return dataset.size
    }


}