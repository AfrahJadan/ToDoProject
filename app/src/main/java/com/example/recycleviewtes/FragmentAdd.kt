    package com.example.recycleviewtes

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.fragment.app.Fragment
    import androidx.fragment.app.activityViewModels
    import androidx.navigation.Navigation
    import androidx.navigation.fragment.findNavController
    import com.example.recycleviewtes.model.ToDoviewModel
    import com.example.recycleviewtes.databinding.FragmentAddTaskBinding
    import com.google.android.material.datepicker.MaterialDatePicker


    class FragmentAdd : Fragment() {
        private val sharedViewModel: ToDoviewModel by activityViewModels()

         var binding: FragmentAddTaskBinding? =null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

           binding = FragmentAddTaskBinding.inflate(inflater,container,false)

            return binding?.root
            // Inflate the layout for this fragment

        }
        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Select Date")
            .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
           // .setInputMode(MaterialDatePicker.INPUT_MODE_TEXT)
            .build()
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding?.saveButton?.setOnClickListener{
            sharedViewModel.addTask()

    binding?.saveButton?.setOnClickListener {
        view:View->
        Navigation.findNavController(view).navigate(R.id.action_fragmentAdd_Task_to_taskFirstAdd)

    }
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
