package com.jer3miahcodes.todoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.jer3miahcodes.todoapp.R
import com.jer3miahcodes.todoapp.ui.theme.Gradient1

@Composable
fun TodoTile(
    title: String,
    isDone: Boolean,
    onTap: () -> Unit,
) {
    return ListItem(
        modifier = Modifier.background(color = MaterialTheme.colorScheme.primary),
        leadingContent = {
            if (isDone) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(brush = Gradient1)
                        .clickable(
                            onClick = onTap
                        )
                )
            }
        },
        headlineContent = {
            Text(
                title, style = TextStyle(
                    color = if (isDone) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSecondary,
                    textDecoration = if (isDone) TextDecoration.LineThrough else TextDecoration.None,
                )
            )
        }
    )
}