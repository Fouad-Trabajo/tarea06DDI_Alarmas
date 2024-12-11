package com.example.tarea06alarmas.features.time.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea06alarmas.databinding.AlarmItemBinding
import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

    private lateinit var binding: AlarmItemBinding

    fun bind(time: Time) {
        binding = AlarmItemBinding.bind(view)
        binding.apply {
            titleTime.text = time.title
            descriptionTime.text = time.description
            description2Time.text = time.description2
        }
    }
}