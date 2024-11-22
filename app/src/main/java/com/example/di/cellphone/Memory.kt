package com.example.di.cellphone

import javax.inject.Inject

class Memory @Inject constructor() {

    override fun toString(): String = TAG

    companion object {
        private val TAG = Memory::class.java.simpleName
    }
}