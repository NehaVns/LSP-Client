package com.example.legal_bridge.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.legalbridge_lsb.R
import com.example.legalbridge_lsb.ui.helper.SharedPreference

class Register_Activity : AppCompatActivity() {
    private lateinit var sharedViewModel: SharedPreference
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


    }
}