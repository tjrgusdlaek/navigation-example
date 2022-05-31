package com.example.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationexample.databinding.FragmentBlank1Binding
import com.example.navigationexample.databinding.FragmentViewPagerBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class BlankFragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBlank1Binding.inflate(inflater, container, false)

        return binding.root
    }

}