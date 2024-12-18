package com.example.tarea06alarmas.features.time.presentation.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea06alarmas.R
import com.example.tarea06alarmas.databinding.AlarmItemBinding
import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

    private lateinit var binding: AlarmItemBinding

    fun bind(time: Time) {
        binding = AlarmItemBinding.bind(view)
        binding.apply {
            titleTime.text = time.title
            description1Time.text = time.description1
            description2Time.text = time.description2

            switchItem.setOnCheckedChangeListener {_,switchOn ->
                val color = if (switchOn) {
                    Toast.makeText(
                        view.context,
                        "Alarma ${time.title} activada",
                        Toast.LENGTH_SHORT
                    ).show()
                     view.context.getColor(R.color.md_theme_scrim)

                } else {
                    Toast.makeText(view.context,"Alarma ${time.title} desactivada",Toast.LENGTH_SHORT).show()
                    view.context.getColor(R.color.md_theme_surfaceDim_highContrast)
                }
                titleTime.setTextColor(color)
                description1Time.setTextColor(color)
                description2Time.setTextColor(color)

            }
        }
    }
}