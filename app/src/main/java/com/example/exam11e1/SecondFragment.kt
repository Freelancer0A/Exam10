package com.example.exam11e1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.exam11e1.databinding.FragmentFirstBinding
import com.example.exam11e1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.secondFragmentTv.text = viewModel.input
        binding.btnHello.setOnClickListener {
            viewModel.addValue("Hello")
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
        binding.btnWorld.setOnClickListener {
            viewModel.addValue(("World"))
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
        return binding.root
    }
}