package com.example.countlories.ui.landing

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countlories.data.remote.response.OutputItem
import com.example.countlories.databinding.ItemFoodBinding

class MainAdapter(private val listFood: List<OutputItem>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback


    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val img = listFood[position].foodPhoto
        val name = listFood[position].foodName
        val desc = listFood[position].descFood

        Glide.with(holder.itemView.context)
            .load(img)
            .into(holder.binding.img)

        holder.binding.tvFoodName.text = name
        holder.binding.tvFoodDesc.text = desc.substring(0,20)+"..."
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listFood[holder.adapterPosition],holder)}
    }

    override fun getItemCount() = listFood.size

    class ViewHolder(var binding: ItemFoodBinding) :RecyclerView.ViewHolder(binding.root)

    interface OnItemClickCallback {
        fun onItemClicked(data: OutputItem, holder: ViewHolder)
    }
}