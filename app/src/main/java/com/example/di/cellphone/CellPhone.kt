package com.example.di.cellphone

import android.util.Log
import javax.inject.Inject

// Dependency injection into constructor
class CellPhone @Inject constructor(
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