package com.example.di

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.di.cellphone.CellPhone
import com.example.di.cellphone.Memory
import com.example.di.cellphone.Processor
import com.example.di.cellphone.Screen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val processor = Processor()
        val memory = Memory()
        val screen = Screen()

        val cellPhone = CellPhone(processor, memory, screen)

        val button: Button = findViewById(R.id.buttonCall)
        button.setOnClickListener {
            cellPhone.makeCall()
        }

    }
}