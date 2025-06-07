package com.example.todoapp

import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()

    fun getAllTodo(): List<Todo> {
        return todoList.toList() // Return a copy to avoid UI not updating
    }

    fun addTodo(title: String, userId: Int = 1) {
        todoList.add(
            Todo(
                id = System.currentTimeMillis().toInt(),
                userId = userId,
                title = title,
                createdAt = Date.from(Instant.now())
            )
        )
    }

    fun deleteTodo(id: Int) {
        todoList.removeIf { it.id == id }
    }
}
