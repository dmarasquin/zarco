package br.joinville.zarco

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class NewIssueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_issue)

        val saveButton = findViewById<Button>(R.id.save_button)
        // TODO: handle data
        saveButton.setOnClickListener({ finish() })
    }
}