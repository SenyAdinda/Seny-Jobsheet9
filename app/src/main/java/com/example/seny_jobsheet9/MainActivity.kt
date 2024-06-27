package com.example.seny_jobsheet9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan layout activity_main ada di res/layout/activity_main.xml
        val buttonMahasiswa = findViewById<Button>(R.id.buttonMahasiswa) // Pastikan buttonMahasiswa ada di activity_main.xml
        val buttonStmik = findViewById<Button>(R.id.buttonStmik) // Pastikan buttonStmik ada di activity_main.xml
        buttonMahasiswa.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                MahasiswaActivity::class.java
            )
            startActivity(intent)
        }
        buttonStmik.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                KampusActivity::class.java
            )
            startActivity(intent)
        }
    }
}
