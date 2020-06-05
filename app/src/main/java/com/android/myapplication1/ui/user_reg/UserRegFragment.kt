package com.android.myapplication1.ui.user_reg


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.reg.view.*

/**
 * A simple [Fragment] subclass.
 */
class UserRegFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.reg, container, false)
        root.button_create.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_userRegFragment_to_nav_driver)
        )
        return root
        }
    }
