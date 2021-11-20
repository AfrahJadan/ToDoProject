package com.example.recycleviewtes.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recycleviewtes.data.task
import com.example.recycleviewtes.data.task_list

class ToDoviewModel: ViewModel() {

    val title =  MutableLiveData<String>("") // change to liveData


    private val _decTask = MutableLiveData<String>("")
    val decTitle: LiveData<String> = _decTask

    private val _date = MutableLiveData<String>("")
    val data: LiveData<String> = _date

    private val _time = MutableLiveData<String>("")
    val time: LiveData<String> = _time

    fun addTask(){

        var task=task(title.value!!,"trghrt","tgtr0","trgtrg")
        task_list.add(task)
    }
}

