package com.jer3miahcodes.todoapp.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader

//
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

//Purple
val Purple800 = Color(0xFF393A4B)
val Purple700 = Color(0xFF4D5067)
val Purple600 = Color(0xFF5B5E7E)
val Purple100 = Color(0xFFC8CBE7)
val Purple300 = Color(0xFFE3E4F1)

//Grey
val Grey600 = Color(0xFF9495A5)
val Grey300 = Color(0xFFD1D2DA)
val Grey50 = Color(0xFFFAFAFA)

//Navy
val Navy950 = Color(0xFF171823)
val Navy900 = Color(0xFF25273D)
val Navy850 = Color(0xFF494C6B)

//Blue
val Blue500 = Color(0xFF3A7CFD)

val Gradient1: Brush = Brush.verticalGradient(
    colors = listOf(Color(0xFF55DDFF), Color(0xFFC058F3)),
    startY = 0f,
    endY = 1f,
)
val Gradient2: Brush = Brush.verticalGradient(
    colors = listOf(Color(0xFF3710BD), Color(0xFFA42395)),
    startY = 0f,
    endY = 1f,
)