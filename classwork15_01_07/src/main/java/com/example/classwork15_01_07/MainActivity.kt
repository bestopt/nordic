package com.example.classwork15_01_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val REQUEST_CODE = 42
        val STRING_PARAM_KEY = "String_param_key"
        val DOUBLE_PARAM_KEY = "Double_param_key"
        val INT_PARAM_KEY = "INT_param_key"
        val TAG = "_Nordic_"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener {
            val intent = Intent(
                this,
                Activity2::class.java
            )
            val params = Bundle()

            if (information.text.isNotEmpty()){
                params.putString(STRING_PARAM_KEY,information.text.toString())

            }
            intent.putExtras(params)

//            params.putInt(INT_PARAM_KEY, 42)
//            params.putDouble(DOUBLE_PARAM_KEY, 42.2)

            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(
                this,
                Activity2::class.java
            )
            val params = Bundle()

            if (information.text.isNotEmpty()){
                params.putString(STRING_PARAM_KEY,information.text.toString())
            }

            intent.putExtras(params)

            startActivityForResult(intent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode== REQUEST_CODE && data!=null){
            information.setText(data.getStringExtra(Activity2.INFO_EXTRA))
            textViewMain.text=data.getStringExtra(Activity2.INFO_EXTRA)
        }

    }
}