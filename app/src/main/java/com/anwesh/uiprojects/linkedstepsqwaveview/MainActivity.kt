package com.anwesh.uiprojects.linkedstepsqwaveview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.stepsqwaveview.StepSqWaveView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StepSqWaveView.create(this)
    }
}
