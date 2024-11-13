package com.example.di

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.di.cellphone.CellPhone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cellPhone = CellPhone()

        val button: Button = findViewById(R.id.buttonCall)
        button.setOnClickListener {
            cellPhone.makeCall()
        }

    }
}