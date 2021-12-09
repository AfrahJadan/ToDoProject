    package com.example.recycleviewtes

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.fragment.app.activityViewModels
    import androidx.fragment.app.viewModels
    import androidx.navigation.Navigation
    import com.example.recycleviewtes.databinding.FragmentShowListBinding
    import com.example.recycleviewtes.model.ToDoviewModel


    class ShowListFragment : Fragment() {
        private val sharedViewModel: ToDoviewModel by activityViewModels()
        private var binding: FragmentShowListBinding? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            binding = FragmentShowListBinding.inflate(inflater, container, false)
            return binding!!.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding?.apply {
                lifecycleOwner=viewLifecycleOwner
                viEwModel=sharedViewModel

            }
        }
    }