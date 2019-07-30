package com.example.classwork20_22_07.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.classwork20_22_07.R
import kotlinx.android.synthetic.main.reciever_layout.*
import kotlinx.android.synthetic.main.sender.*

class ReceiverFragment : Fragment(), OnRecieve, OnSend {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.reciever_layout, container, false)
    }

    override fun onReceive(arg: String) {
        chat.append("\n > $arg")
    }

    override fun onSend(): Int {
        return  chat.text.length
    }
}