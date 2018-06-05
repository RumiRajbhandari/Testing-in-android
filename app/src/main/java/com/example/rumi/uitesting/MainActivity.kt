package com.example.rumi.uitesting

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener({
            var username = et_name.text.toString()
            var password = et_password.text.toString()
            if (checkIfUserIsValid(username, password)) {
                startActivity(Intent(this, UserActivity::class.java))
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }

        })
    }

    private fun checkIfUserIsValid(username: String, password: String) =
            username == Constant.USER_NAME && password == Constant.USER_PASSWORD
}
