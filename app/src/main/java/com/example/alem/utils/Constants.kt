package com.example.alem.utils

import com.example.alem.MainActivity
import com.example.alem.R
import com.example.alem.models.SupportItem

object Constants {
    lateinit var MAIN: MainActivity

    val ABOUT_ITEMS: List<SupportItem> = listOf(SupportItem("Что такое АЛЕМ?", R.drawable.logo),
        SupportItem("Как это работает?", R.drawable.start_img),
        SupportItem("Как вывести деньги?", R.drawable.withdraw))
}