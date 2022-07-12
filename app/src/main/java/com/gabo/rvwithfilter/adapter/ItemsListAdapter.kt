package com.gabo.rvwithfilter.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gabo.rvwithfilter.databinding.ListItemBinding
import com.gabo.rvwithfilter.model.ListItem

class ItemsListAdapter :
    RecyclerView.Adapter<ItemsListAdapter.ItemsListVH>() {
    private var list: List<ListItem> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<ListItem>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class ItemsListVH(binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val image = binding.ivPhoto
        private val title = binding.tvTitle
        private val price = binding.tvPrice
        fun bind(model: ListItem) {
            image.setImageResource(model.image)
            title.text = model.title
            price.text = model.Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsListVH {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemsListVH(binding)
    }

    override fun onBindViewHolder(holder: ItemsListVH, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}