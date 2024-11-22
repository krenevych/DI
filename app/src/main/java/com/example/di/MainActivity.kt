package com.example.di

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.di.cellphone.CellPhone
import com.example.di.cellphone.Memory
import com.example.di.cellphone.Processor
import com.example.di.cellphone.Screen

class MainActivity() : AppCompatActivity() {

    // DI into field
    lateinit var cellPhone: CellPhone
    lateinit var memory: Memory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DI into field
        Component().inject(this)

        val button: Button = findViewById(R.id.buttonCall)
        button.setOnClickListener {
            cellPhone.makeCall()

            Log.d("CellPhone", "memory $memory ")
        }

    }
}