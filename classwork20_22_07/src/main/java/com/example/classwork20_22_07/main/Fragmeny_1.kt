package com.example.classwork20_22_07.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.classwork20_22_07.R
import kotlinx.android.synthetic.main.fragment_1.*

class Fragmeny_1 : Fragment() {

    var listener: NextFragmentInterface? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (activity is NextFragmentInterface) listener = activity as NextFragmentInterface
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("mylogs", "Запущен fragment 1.")
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    fun init() {
        btn1.setOnClickListener {
            if (listener != null) {
                (listener as NextFragmentInterface).nextFragment(Fragmeny_2())
                Log.d("mylogs", " Нажали кнопку To the fragment 2.")
            }
        }
    }

}