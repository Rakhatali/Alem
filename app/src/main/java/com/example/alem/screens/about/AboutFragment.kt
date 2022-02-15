package com.example.alem.screens.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alem.R
import com.example.alem.databinding.FragmentAboutBinding
import com.example.alem.screens.about.screens.FirstFragment
import com.example.alem.screens.about.screens.SecondFragment
import com.example.alem.screens.about.screens.ThirdFragment

class AboutFragment : Fragment() {
    lateinit var binding:FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(layoutInflater)

        val fragmentList = arrayListOf<Fragment>(
                FirstFragment(),
                SecondFragment(),
                ThirdFragment()
        )

        val adapter = VPAdapter(
                fragmentList,
                requireActivity().supportFragmentManager,
                lifecycle
        )

        binding.viewPager2.adapter = adapter

        return binding.root
    }

}