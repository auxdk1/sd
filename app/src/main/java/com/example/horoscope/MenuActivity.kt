package com.example.horoscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horoscope.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageButton3.setOnClickListener {
            val intent = Intent (this@MenuActivity, MainActivity::class.java)
            startActivity(intent)
        }

        binding.asd.setOnClickListener {
            val intent = Intent (this@MenuActivity, activity_horoscope::class.java)
            startActivity(intent)
        }

    }
}