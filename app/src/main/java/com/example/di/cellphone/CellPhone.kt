package com.example.di.cellphone

import android.util.Log

// Dependency injection into constructor
class CellPhone(
    private val processor: Processor,
    private val memory: Memory,
    private val screen: Screen,
) {

//    private val processor = Processor()
//    private val memory = Memory()
//    private val screen = Screen()

    fun makeCall() {
        Log.d(TAG, "phone is making call...")
    }

    override fun toString(): String {
        return "$TAG : $processor + $memory + $screen"
    }

    companion object {
        private val TAG = CellPhone::class.java.simpleName
    }
}