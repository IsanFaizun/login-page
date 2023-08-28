package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            var expectedEmail = "email"
            var expectedPassword = "12345678"

            loginBtn.setOnClickListener {
                val thisEmail = email.text.toString()
                val thisPassword = password.text.toString()

                if (thisEmail == expectedEmail && thisPassword == expectedPassword) {
                    Toast.makeText(
                        this@MainActivity,
                        "Success",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Wrong email or password",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}