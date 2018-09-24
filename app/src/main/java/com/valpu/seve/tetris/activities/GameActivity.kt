package com.valpu.seve.tetris.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.valpu.seve.tetris.R
import com.valpu.seve.tetris.storage.AppPreferences
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferences: AppPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        appPreferences = AppPreferences(this)
        tvHighScore = tv_high_score
        tvCurrentScore = tv_current_score

        updateHighScore()
        updateCurrentScore()

    }

    private fun updateHighScore() {
        tvHighScore?.text = "${appPreferences?.getHighSocore()}"
    }

    private fun updateCurrentScore() {
        tvCurrentScore?.text = "0"
    }
}
