package com.example.exam_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ForgotPasword : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val bView = inflater.inflate(R.layout.fragment_forgot_pasword,container,false)

        val name = requireArguments().getString("data")
        val welcomeText = bView.findViewById<TextView>(R.id.welcome_text)

        welcomeText.text = " Hi $name! \n Forgot Password? 🤔"


        return bView
    }
}