package com.example.androidmaster.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.androidmaster.R

class TodoActivity : AppCompatActivity() {


   private val categories = listOf(
       TaskCategory.Business,
       TaskCategory.Personal,
       TaskCategory.Other
   )

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var rvCategories: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponent()
        initUI()
    }



    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategories)
    }

    private fun initUI() {
       categoriesAdapter = CategoriesAdapter(categories)
       rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
       rvCategories.adapter = categoriesAdapter
    }
}