package com.example.switch_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val new_game = findViewById<Button>(R.id.b_newgame)
        new_game.setOnClickListener {
            val smena_activity = Intent(this, NewGame::class.java)
            startActivity(smena_activity)
        }


        val load_game = findViewById<Button>(R.id.b_loadgame)
        load_game.setOnClickListener {
            val smena_activity = Intent(this, LoadGame::class.java)
            startActivity(smena_activity)
        }


        val game_settings = findViewById<Button>(R.id.b_settings)
        game_settings.setOnClickListener {
            val smena_activity = Intent(this, Settings_A::class.java)
            startActivity(smena_activity)
        }




    }
}