package com.example.alem.screens.signup

import android.os.Bundle
import android.provider.SyncStateContract
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.alem.R
import com.example.alem.databinding.FragmentSignUpBinding
import com.example.alem.models.User
import com.example.alem.room_database.UserViewModel
import com.example.alem.utils.Constants
import kotlinx.coroutines.InternalCoroutinesApi


class SignUpFragment : Fragment() {
    lateinit var binding: FragmentSignUpBinding
    @InternalCoroutinesApi
    private lateinit var mUserViewModel:UserViewModel

    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        return binding.root
    }



    @InternalCoroutinesApi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signupBtnReg.setOnClickListener {
//            insertDataToDatabase()
            Constants.MAIN.navController.navigate(R.id.action_signUpFragment_to_startFragment)
        }
    }

    @InternalCoroutinesApi
    private fun insertDataToDatabase() {
        val id = binding.signupIdEditTv.text.toString()
        val name = binding.signupNameEditTv.text.toString()
        val surname = binding.signupSurnameEditTv.text.toString()
        val patronymic = binding.signupPatronymicEditTv.text.toString()
        val login = binding.signupLogEditTv.text.toString()
        val password = binding.signupPasswordEditTv.text.toString()

        if (inputCheck(id, name, surname, patronymic, login, password)) {
            val user = User(id = Integer.parseInt(id), name = name, surname = surname, patronymic = patronymic, login = login, password = password)
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show()
            Constants.MAIN.navController.navigate(R.id.action_signUpFragment_to_startFragment)
        }
        else {
            Toast.makeText(requireContext(), "Пожалуйста заполните все поля!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun inputCheck(id: String, name: String, surname: String, patronymic: String, login: String, password: String): Boolean {
        return !(TextUtils.isEmpty(id) && TextUtils.isEmpty(name) && TextUtils.isEmpty(surname) && TextUtils.isEmpty(patronymic) && TextUtils.isEmpty(login) && TextUtils.isEmpty(password))
    }

}