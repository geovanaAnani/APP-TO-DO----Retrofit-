package com.generation.todo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.todo.databinding.FragmentFormBinding
import com.generation.todo.databinding.FragmentListBinding

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel : MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(
            layoutInflater, container, false
        )

        mainViewModel.listCategoria()

        mainViewModel.myCatergoriaResponse.observe(viewLifecycleOwner){
            response -> Log.d("Requisição", response.body().toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }
        
        return binding.root
    }
}


