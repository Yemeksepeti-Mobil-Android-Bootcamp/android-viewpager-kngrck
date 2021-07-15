package com.example.android_viewpager_kngrck.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android_viewpager_kngrck.R

class ThirdFragment : Fragment() {
    private lateinit var startButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startButton = view.findViewById(R.id.startButton)
        addListeners()
    }

    private fun addListeners() {
        startButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_homeFragment)
        }
    }
}