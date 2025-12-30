package com.jer3miahcodes.todoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActionScope
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jer3miahcodes.todoapp.ui.theme.Blue500

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String="Create a new todo",
    onDone: (KeyboardActionScope.() -> Unit)? = null,
) {
    return TextField(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(5.dp)
            )
            .fillMaxWidth()
        ,
        value = value,
        label = {Text(label)},
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            autoCorrectEnabled = true,
            imeAction = ImeAction.Done,
        ),
        keyboardActions = KeyboardActions (
            onDone = onDone,
        ),
        shape = RoundedCornerShape(5.dp),
        colors = TextFieldDefaults.colors(
            cursorColor = MaterialTheme.colorScheme.onPrimary,
            focusedTextColor = Blue500,
        ),
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview(){
    var name by remember {
        mutableStateOf("")
    }
    return AppTextField(
        value = name,
        onValueChange = {text -> name = text}
    )
}
