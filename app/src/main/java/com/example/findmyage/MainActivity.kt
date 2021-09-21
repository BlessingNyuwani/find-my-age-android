package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buGetAge.setOnClickListener {
            var userDOB = Integer.parseInt(etDOB.text.toString())


            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var userAageInYears = currentYear- userDOB
            tvShowMyAge.text = "Your age is $userAageInYears years"
        }


    }
}
