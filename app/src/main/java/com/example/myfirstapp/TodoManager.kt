package com.example.myfirstapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<TodoList>()

    fun getAllTodo() : List<TodoList>{
        return todoList;
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String){
        todoList.add(TodoList(System.currentTimeMillis().toInt(), title, Date.from(Instant.now())))
    }

    fun deleteTodo(id: Int){
        todoList.removeIf{
            it.id == id
        }
    }
}