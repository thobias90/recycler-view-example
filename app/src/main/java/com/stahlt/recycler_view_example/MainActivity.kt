package com.stahlt.recycler_view_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.stahlt.recycler_view_example.adapter.ItemAdapter
import com.stahlt.recycler_view_example.data.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemAdapter = ItemAdapter(this, DataSource().load())
        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = itemAdapter
    }
}