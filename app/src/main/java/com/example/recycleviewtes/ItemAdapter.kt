package com.example.recycleviewtes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewtes.data.task

class ItemAdapter( var dataList:List<task>
    ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){
        val viewHold:TextView =view.findViewById(R.id.titleTask) //edit from xml id
        val viewHold2:TextView =view.findViewById(R.id.mo_det)
        val viewHold3:TextView =view.findViewById(R.id.date_task)
        val viewHold4:TextView =view.findViewById(R.id.time)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     val adapterLayout = LayoutInflater.from(parent.context)
         .inflate(R.layout.task_list,parent,false) // this will show the xml file
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val dataItem =dataList[position]
        holder.viewHold.text =dataItem.title // edit from data source var
        holder.viewHold2.text=dataItem.dec_task
        holder.viewHold3.text=dataItem.date.toString()
        holder.viewHold4.text=dataItem.time
    }


    override fun getItemCount(): Int {
        return dataList.size
    }
}