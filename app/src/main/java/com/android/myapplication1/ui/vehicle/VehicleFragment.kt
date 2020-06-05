package com.android.myapplication1.ui.vehicle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.vehicle_details.view.*

class VehicleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.vehicle_details, container, false)
        root.save.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_vehicle_to_TripFragment)
        )
        return root
    }
}