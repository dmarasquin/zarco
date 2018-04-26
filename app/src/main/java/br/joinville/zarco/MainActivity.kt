package br.joinville.zarco

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newIssueButton = findViewById<FloatingActionButton>(R.id.new_issue_button)
        newIssueButton.setOnClickListener({ startActivity(Intent(this, NewIssueActivity::class.java)) })

        // TODO: get the real data from the API
        addDummyData()
    }

    fun addDummyData() {
        val lineChart = findViewById<LineChart>(R.id.chart)
        val list = ArrayList<Entry>()
        for (i: Int in 1..10) {
            list.add(Entry(i.toFloat(), (i.toFloat()) * 2))
        }
        val dataSet = LineDataSet(list, "Label")
        lineChart.data = LineData(dataSet)
    }

    override fun onBackPressed() {
        val closeIntent = Intent(Intent.ACTION_MAIN)
        closeIntent.addCategory(Intent.CATEGORY_HOME)
        startActivity(closeIntent)
    }
}
