package com.jer3miahcodes.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jer3miahcodes.todoapp.components.AppTextField
import com.jer3miahcodes.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppTheme {
                Surface() {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    return Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier.fillMaxSize().padding(padding)
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
fun MainContent(){
    var name by remember {
        mutableStateOf("")
    }
    return Column() {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth().padding(all = 16.dp),
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
            onValueChange = { text -> name = text}
        )
    }
}

@Composable
fun BackgroundImage() {
    return Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(R.drawable.bg_mobile_light, ),
        contentScale = ContentScale.FillWidth,
        contentDescription = "Background Image"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TodoAppTheme {
        HomeScreen()
    }
}