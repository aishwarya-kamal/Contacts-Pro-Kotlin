package com.aishwaryakamal.contactspro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aishwaryakamal.contactspro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // To return to the regular AppTheme
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)

        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main
        )
    }
}
