
package com.example.classwork15_01_07
import android.app.Activity
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    companion object {
        val INFO_EXTRA = "Extra info"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val params = intent.extras

        var result = ""

        if ((params == null) || (params.isEmpty)) {
            result = "Ничего не передали! :("
            Log.d(MainActivity.TAG, result)

        } else if (params.get(MainActivity.STRING_PARAM_KEY) != null) {
            result = result + "\n" + params.getString(MainActivity.STRING_PARAM_KEY)
//            Log.d(
//                MainActivity.TAG,
//                params.getString(MainActivity.STRING_PARAM_KEY)
//
//            )
        }
        textViewAct2.text = result

//        if (
//            params.get(MainActivity.DOUBLE_PARAM_KEY) != null){
//            result = result+ "\n" + params.getDouble(MainActivity.DOUBLE_PARAM_KEY)
//            Log.d(
//                MainActivity.TAG,
//                params.getString(MainActivity.DOUBLE_PARAM_KEY).toString()
//            )
//        }
//        if (
//            params.get(MainActivity.INT_PARAM_KEY) != null){
//            result = result+ "\n" + params.getInt(MainActivity.INT_PARAM_KEY)
//            Log.d(
//                    MainActivity.TAG,
//                    params.getString(MainActivity.INT_PARAM_KEY).toString()
//                )
//        }
        btn1.setOnClickListener {
            val res = "From Activiti2 ${textViewAct2.text}"
            val intent = Intent()
            intent.putExtra(INFO_EXTRA, res)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
