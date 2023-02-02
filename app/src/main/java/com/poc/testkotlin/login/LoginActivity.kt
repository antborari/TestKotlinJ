package com.poc.testkotlin.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.poc.testkotlin.databinding.ActivityMainBinding

val list = arrayOf("Sevilla", "Cádiz", "Huelva")

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpRecyclerview()
    }

    private fun setUpRecyclerview() {

    }

}