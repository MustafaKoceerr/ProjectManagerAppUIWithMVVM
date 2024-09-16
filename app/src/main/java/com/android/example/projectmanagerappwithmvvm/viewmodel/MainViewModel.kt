package com.android.example.projectmanagerappwithmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.android.example.projectmanagerappwithmvvm.repository.MainRepository

class MainViewModel(
    private val repository: MainRepository
):ViewModel() {

    constructor():this(MainRepository())
    fun loadData() = repository.items

}