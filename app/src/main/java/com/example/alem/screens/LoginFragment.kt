package com.example.alem.screens

import android.os.Bundle
import android.provider.SyncStateContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alem.R
import com.example.alem.databinding.FragmentLoginBinding
import com.example.alem.utils.Constants

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startBtnLogin.setOnClickListener {
            Constants.MAIN.binding.bottomNavigation.visibility = View.VISIBLE
            Constants.MAIN.navController.navigate(R.id.action_loginFragment_to_mainFragment2)
        }
    }

}