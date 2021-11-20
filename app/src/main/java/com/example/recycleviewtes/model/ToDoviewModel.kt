package com.example.recycleviewtes.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recycleviewtes.data.Task
import com.example.recycleviewtes.data.TaskDataSorce

class ToDoviewModel: ViewModel() {

    val title =  MutableLiveData<String>("") // change to liveData

    val decTitle = MutableLiveData<String>("") // New way

//    private val _decTask = MutableLiveData<String>("") Old Way
//    val decTitle: LiveData<String> = _decTask

    val data = MutableLiveData<String>("")

//    private val _date = MutableLiveData<String>("")
//    val data: LiveData<String> = _date

    val time = MutableLiveData<String>("")

//    private val _time = MutableLiveData<String>("")
//    val time: LiveData<String> = _time

    fun addTask(){
var theTaskToBeadded= TaskDataSorce()
        theTaskToBeadded.addTask(Task(title.value.toString(),decTitle.value.toString(),data.value.toString(),time.value.toString()))



//        var task=task(title.value!!,decTitle.value!!,data.value!!,time.value!!)
//
//        task_list.add(task)

    }
}

