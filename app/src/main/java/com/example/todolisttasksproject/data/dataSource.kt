package com.example.todolisttasksproject.data

import com.example.todolisttasksproject.R
import com.example.todolisttasksproject.model.Task

class dataSource {
    fun loadTasks(): List<Task> {
        return listOf<Task>(
            Task(R.string.task1),
            Task(R.string.task2),
            Task(R.string.task3),
            Task(R.string.task4),
            Task(R.string.task5)
        )
}
}




