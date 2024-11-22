package com.example.di.cellphone

import javax.inject.Inject

class Screen @Inject constructor() {

    override fun toString(): String = TAG

    companion object {
        private val TAG = Screen::class.java.simpleName
    }
}