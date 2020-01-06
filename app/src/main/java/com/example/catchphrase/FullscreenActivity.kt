package com.example.catchphrase

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


class FullscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        /*
            Screen One:
            - Start Game
            - Download word decks
            - Create word decks

            Start Game Screen:
            - Choose Points to Win
            - Choose timer duration (manual, short, medium, long, random)
            - Choose category
            - Start

            Game Running Screen:
            - Top Left: Team 1 Points
            - Top Right: Team 2 Points
            - Word Shows in Center
            - Tap button to go to next word
            - Asynchronous:
                - Timer
                - Clock ticking sound

            - When receiving timer interrupt, bring up "time's up! other team guesses word" banner
            - Choose team who gets point
            - Did they get guessed word?

            - Return to category selection screen if neither team got to max points; otherwise display game over screen.

            Category Selection Screen:
            - Select category
            - Start button, goes to Game running screen

            Game over screen
            - Game over!
            - Re-match -> Go to category selection screen
            - Main menu
         */

    }

    fun playGame(view: View) {
        
    }
}
