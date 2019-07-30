package com.example.classwork20_22_07.chat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classwork20_22_07.R

class SecondActivity : AppCompatActivity(), ProxyListener {

    val receiverFragment = ReceiverFragment()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        supportFragmentManager.beginTransaction()
            .add(R.id.receiver, receiverFragment, "receiver")
            .add(R.id.sender, SenderFragment(), "sender")
            .commit()
    }

    override fun getCountListener(): OnSend? = receiverFragment


    override fun getReceiverListener(): OnRecieve? = receiverFragment

}