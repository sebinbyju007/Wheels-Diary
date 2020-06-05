package com.android.myapplication1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.homepage.view.*

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.homepage, container, false)

        root.register_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_userRegFragment)
        )

        return root
    }}
