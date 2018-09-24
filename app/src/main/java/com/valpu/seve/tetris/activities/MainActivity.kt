package com.valpu.seve.tetris.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.TextView
import com.valpu.seve.tetris.R
import com.valpu.seve.tetris.storage.AppPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnNewGame = btn_new_game
        val btnResetScore = btn_reset_score
        val btnExit = btn_exit
        tvHighScore = tv_high_score

        btnNewGame.setOnClickListener(this::onBtnNewGameClick)
        btnResetScore.setOnClickListener(this::onBtnResetScore)
        btnExit.setOnClickListener(this::onBtnExit)

    }

    private fun onBtnNewGameClick(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    private fun onBtnResetScore(view: View) {
        val preferences = AppPreferences(this)
        preferences.clearHighScore()
        Snackbar.make(view, "Score successfully reset", Snackbar.LENGTH_SHORT).show()
    }

    private fun onBtnExit(view: View) {
        System.exit(0)
    }
}
