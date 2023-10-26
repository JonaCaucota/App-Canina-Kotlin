package com.example.app_canina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.app_canina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        Log.d("MainActivity", "Activity Created")

        binding.button.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()){
                val ageInt = ageString.toInt();
                val result = ageInt * 7;
                binding.resultText.text = getString(R.string.resul_text, result);
            }
            else {
                Log.d("MainActivity", "Age string is empty");
                Toast.makeText(this, getString(R.string.you_must_insert_your_age), Toast.LENGTH_SHORT).show();
            }
        }
    }
}