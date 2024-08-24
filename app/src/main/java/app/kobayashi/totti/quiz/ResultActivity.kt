package app.kobayashi.totti.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.kobayashi.totti.quiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater).apply{setContentView(this.root)}

        val quizCount: Int = intent.getIntExtra("QuizCount", 0)
        binding.quizCountText.text = "$quizCount 問中・・・"

        val correctCount: Int = intent.getIntExtra("CorrectCount" ,0)
        binding.correctCountText.text = correctCount.toString()

        binding.againButton.setOnClickListener {
            val quizIntent: Intent = Intent(this, QuizActivity::class.java)
            startActivity(quizIntent)
        }
    }
}