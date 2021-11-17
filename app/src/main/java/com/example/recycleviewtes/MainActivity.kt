package com.example.recycleviewtes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleviewtes.data.taskObject
import com.example.recycleviewtes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.task_list)


        setContentView(binding.root)

        //val listOfTask = taskObject.getAllTask()

    // binding.recycleView.adapter = tas_Adapter(listOfTask)

    }


}
