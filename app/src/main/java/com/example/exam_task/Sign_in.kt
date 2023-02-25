package com.example.exam_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [Sign_in.newInstance] factory method to
 * create an instance of this fragment.
 */

class Sign_in : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val rootView = inflater.inflate(R.layout.fragment_sign_in,container,false)
    //    val button = view?.findViewById<Button>(R.id.signButton)
        val inputUserName = rootView.findViewById<EditText>(R.id.inputUserName)
    //    val inputPassword =  view?.findViewById<EditText>(R.id.inputPassword)
        val forgotPass = rootView.findViewById<TextView>(R.id.forgotPass)

        forgotPass!!.setOnClickListener {
            val transaction  = parentFragmentManager.beginTransaction()
              val arguments = Bundle()
              arguments.putString("data",inputUserName.text.toString())

            val signInFragment = ForgotPasword()
            signInFragment.arguments = arguments
            transaction.replace(R.id.myContainer,signInFragment)
            transaction.addToBackStack(" ")
            transaction.commit()

        }
        return rootView
    }

}