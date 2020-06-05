package com.android.myapplication1.ui.driver

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.register.view.*

class DriverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.register, container, false)
        root.button_next.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_driver_to_nav_vehicle)
        )
        return root
    }}
