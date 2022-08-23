package com.project.lalabib.sarvisin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.lalabib.sarvisin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}