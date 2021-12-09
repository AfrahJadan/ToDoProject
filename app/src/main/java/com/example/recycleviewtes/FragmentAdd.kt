    package com.example.recycleviewtes

    import android.app.DatePickerDialog
    import android.content.Context
    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.Button
    import android.widget.TextView
    import androidx.fragment.app.Fragment
    import androidx.fragment.app.activityViewModels
    import androidx.navigation.Navigation
    import androidx.navigation.fragment.findNavController
    import com.example.recycleviewtes.model.ToDoviewModel
    import com.example.recycleviewtes.databinding.FragmentAddTaskBinding
    import com.google.android.material.datepicker.MaterialDatePicker
    import java.text.SimpleDateFormat
    import java.time.DayOfWeek
    import java.time.Month
    import java.time.Year
    import java.util.*


    class FragmentAdd() : Fragment() {
        private val sharedViewModel: ToDoviewModel by activityViewModels()
//data picker
//        private lateinit var tvDate:TextView
//        private lateinit var btnShow:Button
         var binding: FragmentAddTaskBinding? =null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
//            val myCalendar =Calendar.getInstance()
//            val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
//                myCalendar.set(Calendar.YEAR,year)
//                myCalendar.set(Calendar.MONTH,month)
//                myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth)
//                updatelable(myCalendar)
//            }
//            btnShow.setOnClickListener {
//                DatePickerDialog(this,datePicker,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH)
//                    ,myCalendar.get(Calendar.DAY_OF_MONTH)).show()
//            }

        }
//        private fun updatelable(myCalendar:Calendar){
//            val myFormat = "dd-MM-yyyy"
//            val sdf = SimpleDateFormat(myFormat, Locale.UK)
//            tvDate.setText(sdf.format(myCalendar.time))
//
//        }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

           binding = FragmentAddTaskBinding.inflate(inflater,container,false)

            return binding?.root
            // Inflate the layout for this fragment

        }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding?.saveButton?.setOnClickListener{
            sharedViewModel.addTask()
                Navigation.findNavController(view).navigate(R.id.action_fragmentAdd_Task_to_taskFirstAdd)
            }
    binding?.apply {
        lifecycleOwner=viewLifecycleOwner
        vieWModel=sharedViewModel

    }
        }
      //create a fun to add a task
        fun addTask() {
           findNavController().navigate(R.id.action_fragmentAdd_Task_to_taskFirstAdd)
        }
    }
