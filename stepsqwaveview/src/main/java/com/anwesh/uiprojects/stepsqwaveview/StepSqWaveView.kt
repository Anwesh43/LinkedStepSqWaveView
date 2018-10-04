package com.anwesh.uiprojects.stepsqwaveview

/**
 * Created by anweshmishra on 04/10/18.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.Color
import android.content.Context

val nodes : Int = 5

fun Canvas.drawSSWNode(i : Int, scale : Float, paint : Paint) {
    paint.color = Color.parseColor("#4CAF50")
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    paint.strokeWidth = Math.min(w, h) / 60
    paint.strokeCap = Paint.Cap.ROUND
    val gap : Float = w / (nodes)
    save()
    translate(gap * i, h/2)
    for (j in 0..1) {
        val x : Float = gap/2 * j
        val sf : Float = 1f - 2 * j
        val sc : Float = Math.min(0.5f, Math.max(scale - 0.5f, 0f)) * 2
        val path : Path = Path()
        path.moveTo(x, 0f)
        path.lineTo(x, gap/4 * sf * sc)
        path.lineTo(x + gap/2, gap/4 * sf * sc)
        path.lineTo(x+gap/2, 0f)
        drawPath(path, paint)
    }
    restore()
}

class StepSqWaveView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}