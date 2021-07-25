package com.soethan.uicodetest

import androidx.recyclerview.widget.RecyclerView
import com.soethan.uicodetest.databinding.ItemCarBinding

class CarItemViewHolder(val binding:ItemCarBinding,val itemClick:OnClick):RecyclerView.ViewHolder(binding.root){

    init {
        binding.root.setOnClickListener {
            itemClick.invoke()
        }
    }

}