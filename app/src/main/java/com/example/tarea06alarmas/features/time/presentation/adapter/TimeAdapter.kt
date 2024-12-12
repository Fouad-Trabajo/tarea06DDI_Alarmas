package com.example.tarea06alarmas.features.time.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.tarea06alarmas.R
import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeAdapter : ListAdapter<Time, TimeViewHolder>(TimeDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.alarm_item, parent,false)
        return TimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}