package com.android.example.projectmanagerappwithmvvm.repository

import com.android.example.projectmanagerappwithmvvm.domain.TeamDomain

class ProfileRepository {
    val myTeamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in Progress"),
        TeamDomain("Kotlin Developers", "Completed"),

        TeamDomain("Food App Application", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in Progress"),
        TeamDomain("Kotlin Developers", "Completed")
    )

    val archiveItems: MutableList<String> = mutableListOf(
        "UI?UX ScreenShot",
        "Kotlin Source Code",
        "Source Codes"
    )
}