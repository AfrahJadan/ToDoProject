package com.example.recycleviewtes.data

val task_list = mutableListOf<task>()
//Change the name of object to capital letter
object TaskObject {
   fun getAllTask():List<task>{
       return task_list
   }
}
