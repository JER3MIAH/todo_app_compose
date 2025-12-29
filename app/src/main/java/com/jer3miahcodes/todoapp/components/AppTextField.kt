package com.jer3miahcodes.todoapp.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String="Create a new todo",
) {
    return TextField(
        value = value,
        label = {Text(label)},
        onValueChange = onValueChange,
        shape = RoundedCornerShape(5.dp),
    )
}