package com.example.recycleviewtes.data

import task_list


//Change the First of object to capital letter
class TaskDataSorce {
   fun getAllTask():MutableList<Task>{
       return task_list
   }
    fun deleteTask(index: Int){
        task_list.removeAt(index)

    }

fun addTask(task:Task){
    task_list.add(task)
}
}
