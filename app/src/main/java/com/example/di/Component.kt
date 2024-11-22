package com.example.di

import com.example.di.cellphone.CellPhone
import com.example.di.cellphone.Memory
import com.example.di.cellphone.Processor
import com.example.di.cellphone.Screen

class Component {

    private fun createCellPhone(): CellPhone {
        val processor = Processor()
        val memory = Memory()
        val screen = Screen()
        val cellPhone = CellPhone(processor, memory, screen)

        return cellPhone
    }

    fun inject(activity: MainActivity) {
        activity.cellPhone = createCellPhone()
        activity.memory = Memory()
    }

}