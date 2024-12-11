package com.example.tarea06alarmas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea06alarmas.databinding.ActivityMainBinding
import com.example.tarea06alarmas.features.time.domain.data.local.mock.TimeMockLocalDataSource
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

        binding.recyclerView.adapter = timeAdapter

        list(listTime.data)

    }

    private fun list(time: List<Time>) {
        timeAdapter.submitList(time)
        time.forEach {
            Log.d("RecyclerData", it.toString())
        }
    }

    private fun functions() {
        TODO("not emplemented ye")
    }
}