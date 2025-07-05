package com.example.quizapp

import kotlin.collections.*
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.modalClass.Question
import kotlin.properties.Delegates

class QuestionActivity : AppCompatActivity() {
    private lateinit var questionList: MutableList<Question>
    private var currentProgress: Int = 1
    private var isQuestionAnswered = false
    private var choice_choosen = false
    private lateinit var lastClickedView: TextView
    private var score: Int = 0
    private var maxQuestion: Int = 10
    private var isClicked = false
    private lateinit var clickedView: TextView
    private var correctOption by Delegates.notNull<Int>()
    private lateinit var questionTextViews: List<TextView>
    private lateinit var imageViewFlag: ImageView
    private lateinit var seekBarQuestionStatus: ProgressBar
    private lateinit var question1Text: TextView
    private lateinit var question2Text: TextView
    private lateinit var question3Text: TextView
    private lateinit var question4Text: TextView
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageViewFlag = findViewById(R.id.imageViewFlag)
        seekBarQuestionStatus = findViewById(R.id.seekBarStatus)
        question1Text = findViewById(R.id.radioButtonQuestion1)
        question2Text = findViewById(R.id.radioButtonQuestion2)
        question3Text = findViewById(R.id.radioButtonQuestion3)
        question4Text = findViewById(R.id.radioButtonQuestion4)
        buttonNext = findViewById(R.id.buttonNext)
        questionList = Constants.getQuestion().shuffled().take(10) as MutableList<Question>


        setQuestion()

        questionTextViews = listOf(
            question1Text,
            question2Text,
            question3Text,
            question4Text
        )

        for (textView in questionTextViews) {
            textView.setOnClickListener { view ->
                clickedView = view as TextView
                isClicked = true
                if (!choice_choosen) {
                    choice_choosen = true
                    clickedView.background = ContextCompat.getDrawable(this, R.drawable.option_clicked_background)
                    lastClickedView = clickedView
                }
                else {
                    lastClickedView.background = ContextCompat.getDrawable(this, R.drawable.option_border_bg)
                    clickedView.background = ContextCompat.getDrawable(this, R.drawable.option_clicked_background)
                    lastClickedView = clickedView
                }
            }
        }

        buttonNext.setOnClickListener {
            if(!isQuestionAnswered) {
                if (isClicked) {
                    val correctView = questionTextViews[correctOption - 1]
                    correctOptionOrNot(clickedView, correctView)
                    isQuestionAnswered = true
                    if(currentProgress != maxQuestion) {
                        buttonNext.text = getString(R.string.next)
                        for (textView in questionTextViews) {
                            textView.isEnabled = false
                        }
                    }
                    else {
                        buttonNext.text = getString(R.string.finish)
                        val finalIntent = Intent(this, FinishQuiz::class.java)
                        val userName = intent.getStringExtra(Constants.APP_START_NAME_DATA)
                        finalIntent.putExtra(Constants.APP_START_NAME_DATA, userName)
                        finalIntent.putExtra(Constants.QUIZ_FINISH_FINAL_SCORE, score)
                        startActivity(finalIntent)
                    }
                } else {
                    Toast.makeText(this, "Please choose a option", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                for (textView in questionTextViews) {
                    textView.isEnabled = true
                }
                resetViews()
                currentProgress += 1
                buttonNext.text = getString(R.string.check)
                isQuestionAnswered = false
                isClicked = false
                setQuestion()
            }
        }

    }

    private fun setQuestion() {
        val question = questionList[currentProgress - 1]
        imageViewFlag.setImageResource(question.image)
        seekBarQuestionStatus.progress = currentProgress
        question1Text.text = question.option1
        question2Text.text = question.option2
        question3Text.text = question.option3
        question4Text.text = question.option4
        correctOption = question.correctOption

    }

    private fun correctOptionOrNot(clicked: TextView, correctTextView: TextView) {
        if (clicked.text == correctTextView.text) {
            clicked.background = ContextCompat.getDrawable(this, R.drawable.correct_option_background)
            clicked.setTypeface(null, Typeface.BOLD)
            clicked.setTextColor(Color.BLACK)
            score += 1
        } else {
            clicked.background = ContextCompat.getDrawable(this, R.drawable.wrong_option_background)
            correctTextView.background = ContextCompat.getDrawable(this, R.drawable.correct_option_background)
            correctTextView.setTypeface(null, Typeface.BOLD)
            correctTextView.setTextColor(Color.BLACK)
        }
    }


    fun resetViews() {
        for (textView in questionTextViews) {
            textView.isEnabled = true
            textView.background = ContextCompat.getDrawable(this, R.drawable.option_border_bg)
            textView.setTextColor(Color.GRAY)
            textView.setTypeface(null, Typeface.NORMAL)
        }
    }
}


