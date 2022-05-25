package com.example.horoscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.horoscope.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnext.setOnClickListener {
            val intent = Intent (this@MainActivity , Regis2::class.java)
            startActivity(intent)

        }

        binding.fem1.setOnClickListener {
            if (binding.fem1.isChecked){
                binding.male1.isChecked = false
            }
        }

        binding.male1.setOnClickListener {
            if (binding.male1.isChecked){
                binding.fem1.isChecked = false
            }
        }

        binding.male2.setOnClickListener {
            if (binding.male2.isChecked){
                binding.fem2.isChecked = false
            }
        }

        binding.fem2.setOnClickListener {
            if (binding.fem2.isChecked){
                binding.male2.isChecked = false
            }
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) finish()
        return true
    }


}