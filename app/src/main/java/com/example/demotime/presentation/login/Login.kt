package com.example.demotime.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Login(
    onSuccessfulLogin: (name: String) -> Unit
) {
    var name by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.wrapContentWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Name")
        TextField(value = name, onValueChange = { name = it } )
        
        Button(onClick = {
            onSuccessfulLogin(name)
        }) {
            Text(text = "Login")
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    Login(onSuccessfulLogin = { })
}