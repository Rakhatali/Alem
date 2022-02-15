package com.example.alem.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alem.R
import com.example.alem.databinding.FragmentStartBinding
import com.example.alem.utils.Constants

class StartFragment : Fragment() {
    lateinit var binding: FragmentStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentStartBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegistration.setOnClickListener {
            Constants.MAIN.navController.navigate(R.id.action_startFragment_to_signUpFragment)
        }

        binding.startBtnLogin.setOnClickListener {
            Constants.MAIN.navController.navigate(R.id.action_startFragment_to_loginFragment)
        }

    }

}