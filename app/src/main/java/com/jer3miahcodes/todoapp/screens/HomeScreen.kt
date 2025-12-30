package com.jer3miahcodes.todoapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jer3miahcodes.todoapp.BackgroundImage
import com.jer3miahcodes.todoapp.R
import com.jer3miahcodes.todoapp.components.AppTextField


@Composable
fun HomeScreen() {
    return Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                Box(
                    modifier = Modifier
                ) {
                    BackgroundImage()
                    MainContent()
                }
            }
        }
    )
}

@Composable
fun MainContent() {
    var name by remember {
        mutableStateOf("")
    }

    return Column(
        modifier = Modifier.padding(all = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.todo_icon),
                contentDescription = "TODO Icon"
            )

            Image(
                painter = painterResource(R.drawable.icon_moon),
                contentDescription = "Theme Icon"
            )
        }

        // Text field
        AppTextField(
            value = name,
            onValueChange = { text -> name = text }
        )

        LazyColumn {
            item {

            }
        }
    }
}
