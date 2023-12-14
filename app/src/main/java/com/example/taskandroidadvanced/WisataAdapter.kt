package com.example.taskandroidadvanced

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(private var wisataList:List<Wisata>) : RecyclerView.Adapter<WisataAdapter.FoodViewHolder>(){

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wisata , parent , false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.imageView.setImageResource(wisata.image)
        holder.textView.text = wisata.name
    }
}