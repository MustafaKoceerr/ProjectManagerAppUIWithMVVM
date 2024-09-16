package com.android.example.projectmanagerappwithmvvm.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.android.example.projectmanagerappwithmvvm.repository.MainRepository
import com.android.example.projectmanagerappwithmvvm.repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository): ViewModel(){
    constructor() : this(ProfileRepository())

    fun loadDataMyTeam() = repository.myTeamItems
    fun loadDataArchive() = repository.archiveItems
}
