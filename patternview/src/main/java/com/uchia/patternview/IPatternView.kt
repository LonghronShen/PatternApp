package com.uchia.patternview

import android.content.Context

/**
 * Created by uchia on 2018/6/16.
 */
interface IPatternView {

    var gridColumns: Int
    var gridRows: Int

    var numberTextSize : Float

    var pathWidth: Float

    var squareWidth : Float
    var squareHeight : Float

    var inProgressX : Float
    var inProgressY : Float

    var animatingPeriodStart: Long

    val hostContext: Context

    fun getPaddingTop() : Int

    fun getPaddingLeft() : Int

    fun getHostViewWidth() : Int

    fun getHostViewHeight() : Int

    fun isHostInEditMode() : Boolean

    fun getCenterXForColumn(column: Int): Float

    fun getCenterYForRow(row: Int): Float

    fun invalidate()

}