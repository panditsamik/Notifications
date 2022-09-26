package com.example.notifications

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.tapadoo.alerter.Alerter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val normalalert = findViewById<Button>(R.id.normalalert)
        val customizedalert = findViewById<Button>(R.id.customizedalert)
        val swipealert = findViewById<Button>(R.id.swipealert)
        val progressalert = findViewById<Button>(R.id.progressalert)
        val buttonalert = findViewById<Button>(R.id.buttonalert)

        normalalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        customizedalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setBackgroundColorInt(Color.GREEN)
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        swipealert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .enableSwipeToDismiss()
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        progressalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .enableProgress(true)
                .setProgressColorInt(Color.CYAN)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        buttonalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .addButton("YES", com.tapadoo.alerter.R.style.AlertButton, View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .addButton("NO",com.tapadoo.alerter.R.style.AlertButton,View.OnClickListener {
                    Toast.makeText(this,"OOPS",Toast.LENGTH_SHORT).show()
                })
                .show()
        }
    }
}
