package com.example.quizapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nameEditText: EditText = findViewById(R.id.editTextTextNameStart)
        val startButton: Button = findViewById(R.id.buttonStart)

        startButton.setOnClickListener {
            if(nameEditText.text.toString().isNotEmpty()) {
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putExtra(Constants.APP_START_NAME_DATA, nameEditText.text.toString())
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity, "Please enter a valid name", Toast.LENGTH_SHORT).show()
            }

        }
    }
}