package com.android.myapplication1.ui.exit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.datastore.view.*
import kotlinx.android.synthetic.main.vehicle_details.view.*

class ExitFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.datastore, container, false)
        root.reload.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_exit_to_nav_home))
        return root
    }
}