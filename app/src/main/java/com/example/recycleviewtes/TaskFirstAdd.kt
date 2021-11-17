package com.example.recycleviewtes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.recycleviewtes.data.taskObject
import com.example.recycleviewtes.databinding.FragmentTaskFirstAddBinding


class TaskFirstAdd : Fragment() {
private lateinit var binding:FragmentTaskFirstAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentTaskFirstAddBinding.inflate(inflater,container,false)
       // return inflater.inflate(R.layout.fragment_task_first_add, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context,"here",Toast.LENGTH_SHORT).show()
        val listOfTask = taskObject.getAllTask()
        binding.recycleView.adapter = tas_Adapter(listOfTask)
    }
}