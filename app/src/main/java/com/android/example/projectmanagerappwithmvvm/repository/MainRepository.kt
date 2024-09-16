package com.android.example.projectmanagerappwithmvvm.repository

import com.android.example.projectmanagerappwithmvvm.domain.OnGoingDomain

class MainRepository {
    val items = listOf(
        OnGoingDomain("Food App", "June 12, 2023", 50, "ongoing1"),
        OnGoingDomain("AI Recording", "June 26, 2023", 60, "ongoing2"),
        OnGoingDomain("Weather App","July 22, 2023", 25, "ongoing3"),
        OnGoingDomain("E-Book App", "June 13, 2023", 80, "ongoing4"),
        OnGoingDomain("Bank App", "June 12, 2023", 50, "ongoing1"),
        OnGoingDomain("Crypto App", "June 26, 2023", 60, "ongoing2"),
        OnGoingDomain("Sound Recording App","July 22, 2023", 25, "ongoing3"),
    )
}