package com.example.horoscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horoscope.databinding.ActivityQuestion1Binding

class Question1 : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnext.setOnClickListener {
            val intent = Intent (this@Question1 , Result::class.java)
            startActivity(intent)
        }

    }
}