package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    lateinit var myLayout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"on create",Snackbar.LENGTH_LONG).show()




    }

    override fun onStart() {
        super.onStart()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onStart",Snackbar.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onResume",Snackbar.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onPause",Snackbar.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onPause",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onRestart",Snackbar.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        myLayout = findViewById(R.id.clMain)
        Snackbar.make( myLayout,"onDestroy",Snackbar.LENGTH_LONG).show()

    }

}