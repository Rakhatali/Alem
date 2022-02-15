package com.example.alem.screens.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alem.R
import com.example.alem.databinding.FragmentProfileBinding
import com.example.alem.utils.Constants

class ProfileFragment : Fragment() {
    lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.quitBtn.setOnClickListener {
            Constants.MAIN.binding.bottomNavigation.visibility = View.GONE
            Constants.MAIN.navController.navigate(R.id.action_profileFragment_to_startFragment)
        }
    }
}