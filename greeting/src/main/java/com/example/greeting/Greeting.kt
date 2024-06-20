package com.example.greeting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier


@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(horizontal = 100.dp, vertical = 300.dp)
        )
    }
}