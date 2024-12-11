package com.example.tarea06alarmas.features.time.domain.data.local.mock

import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeMockLocalDataSource {

    private val description = "Sonar una vez"
    val data = listOf(
        Time("1", "7:30", description, "Alarma desperatador"),
        Time("2", "7:43", description, "Alarama 2"),
        Time("3", "", description, ""),
        Time("4", "", description, ""),
        Time("5", "", description, " Alarma noche"),
        Time("6", "", description, "")
    )
}