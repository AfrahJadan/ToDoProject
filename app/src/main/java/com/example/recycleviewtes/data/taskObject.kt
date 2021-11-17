package com.example.recycleviewtes.data

var task_list = mutableListOf<task>(
    task("Morning Workout","Running outside for an our",17/11/2021,"6:00am"),
    task("Go to Work","Finish From All work before Weekend",18/11/2021,"8:00am")

)
object taskObject {
   fun getAllTask():List<task>{
       return task_list
   }
}