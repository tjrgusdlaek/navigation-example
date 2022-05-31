package com.example.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationexample.databinding.FragmentBlank2Binding
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class BlankFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBlank2Binding.inflate(inflater, container, false)

        return binding.root
    }

}