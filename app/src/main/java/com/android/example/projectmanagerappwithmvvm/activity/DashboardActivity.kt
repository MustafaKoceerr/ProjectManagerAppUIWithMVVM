package com.android.example.projectmanagerappwithmvvm.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.android.example.projectmanagerappwithmvvm.R
import com.android.example.projectmanagerappwithmvvm.adapter.OnGoingAdapter
import com.android.example.projectmanagerappwithmvvm.databinding.ActivityMainBinding
import com.android.example.projectmanagerappwithmvvm.viewmodel.MainViewModel

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding) {
            val onGoingAdapter by lazy { OnGoingAdapter(mainViewModel.loadData()) }

            recyclerViewOngoing.apply {
                adapter = onGoingAdapter
                layoutManager = GridLayoutManager(this@DashboardActivity, 2)
            }
        }

    }
}