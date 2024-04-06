package com.example.myfirstapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class TodoList(
    var id: Int,
    var title: String,
    var createdAt: Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeTodoList(): List<TodoList>{
    return listOf<TodoList>(
        TodoList(1, "First Todo", Date.from(Instant.now())),
        TodoList(2, "Second Todo", Date.from(Instant.now())),
        TodoList(3, "Third Todo", Date.from(Instant.now())),
    );
}
