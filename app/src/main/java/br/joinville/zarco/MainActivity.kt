package br.joinville.zarco

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newIssueButton = findViewById<FloatingActionButton>(R.id.new_issue_button)
        newIssueButton.setOnClickListener({ startActivity(Intent(this, NewIssueActivity::class.java)) })
    }

    override fun onBackPressed() {
        val closeIntent = Intent(Intent.ACTION_MAIN)
        closeIntent.addCategory(Intent.CATEGORY_HOME)
        startActivity(closeIntent)
    }
}
