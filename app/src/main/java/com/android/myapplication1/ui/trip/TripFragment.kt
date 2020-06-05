package com.android.myapplication1.ui.trip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.trip_details.view.*

class TripFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.trip_details, container, false)
        root.button_trip.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_TripFragment_to_nav_exit)        )
        return root
    }
}