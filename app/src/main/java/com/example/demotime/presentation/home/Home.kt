package com.example.demotime.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.demotime.Helpers
import com.example.demotime.data.LawnMower

@Composable
fun Home(
    name: String,
    onLogout: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.align(CenterHorizontally),
            text = "Welcome back from backStackEntry, $name!",
            fontSize = 24.sp
        )

        Text(
            modifier = Modifier.align(CenterHorizontally),
            text = "Welcome back from savedStateHandle, ${viewModel.name}!",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        val mowers = Helpers.getLawnMowers()
        LazyRow {
            items(mowers) {
                MowerUi(lawnMower = it)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            modifier = Modifier.align(CenterHorizontally),
            onClick = { onLogout() }
        ) {
            Text(text = "Logout")
        }
    }
}

@Composable
private fun MowerUi(lawnMower: LawnMower) {
    Card(
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color.Gray,
        modifier = Modifier
            .width(400.dp)
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Column {
            Image(painter = painterResource(id = lawnMower.imageId), contentDescription = "")
            Column(modifier = Modifier.padding(start = 24.dp)) {
                Text(text = lawnMower.name)
                Text(text = "$${lawnMower.price}")
            }
        }

    }
}