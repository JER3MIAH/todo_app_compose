package com.jer3miahcodes.todoapp.models

data class Todo(
    var id: Int,
    var title: String,
    var isDone: Boolean = false,
)
