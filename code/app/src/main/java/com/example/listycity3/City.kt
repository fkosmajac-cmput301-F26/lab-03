package com.example.listycity3

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class City(
    name: String,
    province: String
) {
    var name by mutableStateOf(name)
    var province by mutableStateOf(province)
}
