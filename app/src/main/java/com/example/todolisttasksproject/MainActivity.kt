package com.example.todolisttasksproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.todolisttasksproject.adapter.ItemAdapter
import com.example.todolisttasksproject.data.dataSource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize data.
        val myDataset = dataSource().loadTasks()

        val navHost = findViewById<RecyclerView>(R.id.nav_host_fragment_container)as NavHost
        val navController = navHost.navController
        setupActionBarWithNavController(navController)



       // recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
      //recyclerView.setHasFixedSize(true)

    }
}
