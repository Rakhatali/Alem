package com.example.alem.screens.support

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alem.databinding.FragmentSupportBinding
import com.example.alem.utils.Constants


class SupportFragment : Fragment() {

    lateinit var binding: FragmentSupportBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSupportBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.supportRecycler.layoutManager = LinearLayoutManager(Constants.MAIN, LinearLayoutManager.HORIZONTAL, false)
        binding.supportRecycler.adapter = CustomRecyclerAdapter(Constants.ABOUT_ITEMS)
    }


}