package com.example.recycleviewtes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.recycleviewtes.data.TaskObject
import com.example.recycleviewtes.databinding.FragmentTaskFirstPageBinding


class TaskFirstPage : Fragment() {
    private  var binding: FragmentTaskFirstPageBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       binding =DataBindingUtil.inflate(inflater,R.layout.fragment_task_first_page,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "Right your First Task", Toast.LENGTH_SHORT).show()
binding?.addTasks?.setOnClickListener{
    val action =TaskFirstPageDirections.actionTaskFirstPageToFragmentAddTask()
    findNavController().navigate(action)
}

 binding?.recycleView?.adapter = ItemAdapter(TaskObject.getAllTask())

    }

}




//        add_tasks.setOnClickListener {
//                Navigation.findNavController(it).navigate(R.id.fragmentAdd_Task)
//            }

//       add_tasks.setOnClickListener {
//            val action = TaskFirstAdd.
//         findNavController().navigate(action)
//      }
//val datePicker = // try to let the date work
//    MaterialDatePicker.Builder.datePicker()
//        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
//datePicker.build()

//            val title = textViewS.text.toString()
//            val decTitle = textViewSA.text.toString()
//            val date = date_input.text.toString()
//            val time = time.text.toString()
//            val toDoModel = task(title, decTitle, date , time)
//            setOf(toDoModel)
