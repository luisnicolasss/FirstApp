package com.example.androidmaster.todoapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R
import com.example.androidmaster.todoapp.Task
import com.example.androidmaster.todoapp.viewholder.CategoriesViewHolder
import com.example.androidmaster.todoapp.viewholder.TasksViewHolder

class TasksAdapter(private val tasks:List<Task>): RecyclerView.Adapter<TasksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return TasksViewHolder(view)
    }

    override fun getItemCount(): Int = tasks.size

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(tasks[position])
    }


}