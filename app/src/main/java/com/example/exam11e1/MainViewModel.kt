package com.example.exam11e1

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var input: String = ""
    fun addValue(s: String) {
        input = s
    }
}