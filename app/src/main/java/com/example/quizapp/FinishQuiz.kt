package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FinishQuiz : AppCompatActivity() {
    private lateinit var nameViewText: TextView
    private lateinit var scoreViewText: TextView
    private lateinit var finishButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finish_quiz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nameViewText = findViewById(R.id.textViewName)
        scoreViewText = findViewById(R.id.textViewScore)
        finishButton = findViewById(R.id.button)

        val thirdIntent = Intent(this, MainActivity::class.java)
        val userName = intent.getStringExtra(Constants.APP_START_NAME_DATA)
        val score = intent.getIntExtra(Constants.QUIZ_FINISH_FINAL_SCORE, 0)

        nameViewText.text = userName
        scoreViewText.text = "Your score is $score out of 10"


        finishButton.setOnClickListener {
            startActivity(thirdIntent)
        }
    }
}