package com.example.tarea06alarmas

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarea06alarmas.databinding.ActivityMainBinding
import com.example.tarea06alarmas.features.time.data.local.mock.TimeMockLocalDataSource
import com.example.tarea06alarmas.features.time.domain.model.Time
import com.example.tarea06alarmas.features.time.presentation.adapter.TimeAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val timeAdapter = TimeAdapter()
    private val listTime = TimeMockLocalDataSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView(listTime.data)
        functions()

    }

    // Esta función es para inicializar/inflar el RecyclerView en la interfaz
    private fun setupView(time: List<Time>) {
        binding.apply {
            recyclerView.layoutManager =
                LinearLayoutManager(
                    this@MainActivity, LinearLayoutManager.VERTICAL, false
                )
            recyclerView.adapter = timeAdapter
        }

        timeAdapter.submitList(time)
    }

    private fun functions() {
        binding.apply {
            iconButton.setOnClickListener {
                Toast.makeText(this@MainActivity, "Añadir nueva alarma", Toast.LENGTH_SHORT).show()
            }
        }
    }
}