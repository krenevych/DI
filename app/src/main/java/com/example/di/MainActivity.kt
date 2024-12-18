package com.example.di

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.di.cellphone.CellPhone
import com.example.di.cellphone.Memory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity() : AppCompatActivity() {

    // DI into field
//    @Inject
//    lateinit var cellPhone: CellPhone

    @Inject
    lateinit var memory1: Memory
    @Inject
    lateinit var memory2: Memory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.buttonCall)
        button.setOnClickListener {
//            cellPhone.makeCall()

            Log.d("MEMORY_TAG", "memory1: $memory1 ")
            Log.d("MEMORY_TAG", "memory2: $memory2 ")
        }

    }
}