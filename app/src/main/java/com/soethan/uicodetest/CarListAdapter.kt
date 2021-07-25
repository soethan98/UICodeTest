package com.soethan.uicodetest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soethan.uicodetest.databinding.ItemCarBinding

typealias OnClick = () -> Unit

class CarListAdapter(val onClick: OnClick) : RecyclerView.Adapter<CarItemViewHolder>() {

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: CarItemViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarItemViewHolder {
        val binding =
            ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarItemViewHolder(binding, onClick)
    }
}