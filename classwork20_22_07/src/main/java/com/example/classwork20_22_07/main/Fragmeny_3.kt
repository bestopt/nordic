package com.example.classwork20_22_07.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.classwork20_22_07.R
import kotlinx.android.synthetic.main.fragment_3.*

class Fragmeny_3 : Fragment() {

    var listener: NextFragmentInterface? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (activity is NextFragmentInterface) listener = activity as NextFragmentInterface
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("mylogs", "Запущен fragment 3.")
        return inflater.inflate(R.layout.fragment_3, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    fun init() {
        btn3.setOnClickListener {
            if (listener != null) {
                (listener as NextFragmentInterface).nextFragment(Fragmeny_1())
                Log.d("mylogs", " Нажали кнопку To the fragment 1.")
            }
        }
    }
}