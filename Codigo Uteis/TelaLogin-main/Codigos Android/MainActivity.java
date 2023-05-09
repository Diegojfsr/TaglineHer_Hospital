package com.example.login;

import

public class MainActivity : AppCompatActivity() {
    override fun onCreate(Bundle savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suppertActionBar?.hide()
        window.statusBarColor = Color.parseColor(colorString: "#F7E64F")

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(packageContext: this, Home::class.java)
            startActivity(intent)
            finish()
        },delayMillis: 3000)
    }     
}