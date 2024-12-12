package com.example.tarea06alarmas.features.time.data.local.mock

import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeMockLocalDataSource {

    private val description = "Sonar una vez"
    val data = listOf(
        Time("1", "7:30", description, "Alarma despertador"),
        Time("2", "7:43", description, "Alarama 2"),
        Time("3", "12:00", description, ""),
        Time("4", "16:30", description, ""),
        Time("5", "21:00", description, " Alarma noche"),
        Time("6", "15:15", description, ""),
        Time("5", "23:59", description, " Alarma noche"),
        Time("6", "22:22", description, ""),
        Time("5", "15:45", description, " Alarma noche"),
        Time("6", "0:00", description, "")
    )
}