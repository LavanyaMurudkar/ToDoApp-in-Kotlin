package com.example.todoapp

import java.util.Date
import java.time.Instant

data class Todo(
    var id: Int,
    val userId: Int,
    var title: String,
    var createdAt: Date
)

fun getFakeTodo(): List<Todo> {
    return listOf(
        Todo(1, 101, "First todo", Date.from(Instant.now())),
        Todo(2, 102, "Second todo", Date.from(Instant.now())),
        Todo(3, 103, "This is my third todo", Date.from(Instant.now())),
        Todo(4, 104, "This will be my fourth todo so that I can use it in UI", Date.from(Instant.now()))
    )
}

