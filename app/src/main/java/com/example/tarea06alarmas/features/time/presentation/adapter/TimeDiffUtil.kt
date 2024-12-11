package com.example.tarea06alarmas.features.time.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeDiffUtil : DiffUtil.ItemCallback<Time>() {
    override fun areItemsTheSame(oldItem: Time, newItem: Time): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Time, newItem: Time): Boolean {
        return oldItem == newItem
    }
}