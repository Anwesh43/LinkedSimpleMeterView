package com.example.simplemeterview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#2196F3",
    "#8BC34A",
    "#9C27B0",
    "#03A9F4"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 2
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 3.5f
val delay : Long = 20
val deg : Float = 300f
val start : Float = 120f

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
