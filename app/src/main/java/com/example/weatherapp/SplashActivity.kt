package com.example.weatherapp

import android.content.Context
import android.os.Bundle
import android.text.TextUtils.TruncateAt
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.security.KeyStore.TrustedCertificateEntry
import java.util.Calendar

class SplashActivity : AppCompatActivity() {

    val monthsAbbreviations = arrayOf(
        "JAN", // January
        "FEB", // February
        "MAR", // March
        "APR", // April
        "MAY", // May
        "JUN", // June
        "JUL", // July
        "AUG", // August
        "SEP", // September
        "OCT", // October
        "NOV", // November
        "DEC"  // December
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        findViewById<TextView>(R.id.date_text).setText(Calendar.DAY_OF_MONTH)
        findViewById<TextView>(R.id.month_text).setText(monthsAbbreviations[Calendar.MONTH+1])
        findViewById<LinearLayout>(R.id.main).visibility = View.VISIBLE

    }
}
