package com.example.di.cellphone

import javax.inject.Inject

class Processor @Inject constructor() {

    override fun toString(): String = TAG

    companion object {
        private val TAG = Processor::class.java.simpleName
    }
}