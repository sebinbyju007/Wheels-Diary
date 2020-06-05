package com.android.myapplication1.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.myapplication1.R
import kotlinx.android.synthetic.main.login.view.*

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.login, container, false)
        //root.logged_button.setOnClickListener {
                //Navigation.createNavigateOnClickListener(R.id.action_nav_login_to_nav_driver)


        return root
    }
}