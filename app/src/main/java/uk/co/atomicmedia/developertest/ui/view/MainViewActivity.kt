package uk.co.atomicmedia.developertest.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uk.co.atomicmedia.developertest.databinding.ActivityMainBinding

class MainViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}