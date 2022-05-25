package com.example.horoscope

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import com.example.horoscope.databinding.ActivityRegis2Binding
import java.util.*

class Regis2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegis2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegis2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnext.setOnClickListener {
            val intent = Intent (this@Regis2 , Question1::class.java)
            startActivity(intent)
        }

        binding.editTextTextPersonName3.setOnClickListener {
            setDate1()
        }

        binding.editTextTextPersonName2.setOnClickListener {
            setDate()
        }


    }
    private fun setDate(){
        val datePicker = Calendar.getInstance()
        val date = DatePickerDialog.OnDateSetListener{
                view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
            datePicker[Calendar.YEAR] = year
            datePicker[Calendar.MONTH]= month
            datePicker[Calendar.DAY_OF_MONTH] = dayOfMonth
            val dateFormat = "dd/MMMM/yyyy"
            val simpleDateFormat = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                SimpleDateFormat(dateFormat,
                    Locale.getDefault()
                )
            } else {
                TODO("VERSION.SDK_INT < N")
            }
            binding.editTextTextPersonName2.text = simpleDateFormat.format(
                datePicker.time
            )
        }
        DatePickerDialog(
            this@Regis2,date,
            datePicker[Calendar.YEAR],
            datePicker[Calendar.MONTH],
            datePicker[Calendar.DAY_OF_MONTH]
        ).show()
    }

    private fun setDate1(){
        val datePicker = Calendar.getInstance()
        val date = DatePickerDialog.OnDateSetListener{
                view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
            datePicker[Calendar.YEAR] = year
            datePicker[Calendar.MONTH]= month
            datePicker[Calendar.DAY_OF_MONTH] = dayOfMonth
            val dateFormat = "dd/MMMM/yyyy"
            val simpleDateFormat = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                SimpleDateFormat(dateFormat,
                    Locale.getDefault()
                )
            } else {
                TODO("VERSION.SDK_INT < N")
            }
            binding.editTextTextPersonName3.text = simpleDateFormat.format(
                datePicker.time
            )
        }
        DatePickerDialog(
            this@Regis2,date,
            datePicker[Calendar.YEAR],
            datePicker[Calendar.MONTH],
            datePicker[Calendar.DAY_OF_MONTH]
        ).show()
    }


}