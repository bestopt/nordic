package com.example.classwork20_22_07.chat

interface ProxyListener {
    fun getCountListener(): OnSend?
    fun getReceiverListener(): OnRecieve?
}