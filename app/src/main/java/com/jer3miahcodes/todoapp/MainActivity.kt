package com.jer3miahcodes.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jer3miahcodes.todoapp.screens.HomeScreen
import com.jer3miahcodes.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppTheme {
                Surface {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun BackgroundImage() {
    return Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(R.drawable.bg_mobile_light),
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