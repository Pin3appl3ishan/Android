package com.example.loginactivity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginactivity.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    lateinit var messageViewBinding : ActivityLoginBinding

    var user: String? = null
    var password: String? = null
    var remember: Boolean = false




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        messageViewBinding = ActivityLoginBinding.inflate(layoutInflater)
        var view = messageViewBinding.root

        messageViewBinding.btnRegister.setOnClickListener {

        }
        setContentView(view)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}