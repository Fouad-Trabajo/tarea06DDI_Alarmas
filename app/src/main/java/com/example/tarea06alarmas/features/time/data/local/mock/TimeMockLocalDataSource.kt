package com.example.tarea06alarmas.features.time.data.local.mock

import com.example.tarea06alarmas.features.time.domain.model.Time

class TimeMockLocalDataSource {

    private val description1 = "Sonar una vez"
    val data = mutableListOf(
        Time("1", "7:30", description1, "| Alarma despertador", false),
        Time("2", "7:43", description1, "| Alarama 2", false),
        Time("3", "9:51", description1, "", false),
        Time("4", "22:43", description1, "", false),
        Time("5", "23:42", description1, "| Alarma noche", false),
        Time("6", "23:51", description1, "", false),
        Time("7", "18:00", description1, "| Tomarme la pastilla", false),
        Time("8", "21:00", description1, "| Pasear al perro", false),

    )
}