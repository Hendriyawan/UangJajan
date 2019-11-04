package com.hdev.kt.uangjajan.adapter

import android.support.v4.content.ContextCompat
import android.support.v7.widget.CardView
import android.view.View
import android.widget.ImageView
import com.hdev.kt.uangjajan.R
import org.jetbrains.anko.backgroundDrawable
import org.jetbrains.anko.imageResource

fun View.changeTint(status: String?) {
    when (this) {
        is ImageView -> {
            when (status) {
                "success" -> {
                    imageResource = R.drawable.ic_check
                    backgroundDrawable?.setTint(ContextCompat.getColor(context, android.R.color.holo_green_dark))
                    drawable.setTint(ContextCompat.getColor(context, android.R.color.holo_green_dark))
                }
                "failed" -> {
                    imageResource = R.drawable.ic_close
                    backgroundDrawable?.setTint(ContextCompat.getColor(context, android.R.color.holo_red_dark))
                    drawable.setTint(ContextCompat.getColor(context, android.R.color.holo_red_dark))
                }
                "pending" -> {
                    imageResource = R.drawable.ic_access_time
                    backgroundDrawable?.setTint(ContextCompat.getColor(context, android.R.color.holo_blue_dark))
                    drawable.setTint(ContextCompat.getColor(context, android.R.color.holo_blue_dark))
                }
            }
        }
        is CardView -> {
            when (status) {
                "success" -> backgroundDrawable = context.resources.getDrawable(R.drawable.bg_item_green)
                "failed" -> backgroundDrawable = context.resources.getDrawable(R.drawable.bg_item_red)
                "pending" -> backgroundDrawable = context.resources.getDrawable(R.drawable.bg_item_blue)
            }
        }
    }
}