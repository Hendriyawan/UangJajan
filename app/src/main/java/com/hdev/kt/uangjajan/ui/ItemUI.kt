package com.hdev.kt.uangjajan.ui

import android.graphics.Color
import android.view.ViewGroup
import com.hdev.kt.uangjajan.R
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class ItemUI : AnkoComponent<ViewGroup> {

    companion object {
        const val id_card_view = 1
        const val id_text_amount = 2
        const val id_text_description = 3
        const val id_icon = 4
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        //CardView
        cardView {
            id = id_card_view
            lparams(width = matchParent, height = wrapContent) {margin = dip(8)}
            cardElevation = dip(1).toFloat()
            radius = dip(15).toFloat()

            //RelativeLayout
            relativeLayout {
                backgroundResource = attr(R.attr.selectableItemBackground).resourceId
                isClickable = true

                //TextView amount
                textView {
                    id = id_text_amount
                    textAppearance = android.R.attr.textAppearanceMedium
                    textColor = Color.BLACK

                }.lparams(wrapContent, wrapContent) {
                    centerInParent()
                    alignParentStart()
                    topMargin = dip(8)
                    marginStart = dip(8)
                }

                //TextView description
                textView {
                    id = id_text_description
                    textAppearance = android.R.attr.textAppearanceSmall
                }.lparams(wrapContent, wrapContent) {
                    topMargin = dip(8)
                    below(id_text_amount)
                    marginStart = dip(8)
                }

                //ImageView IC status
                imageView {
                    id = id_icon
                    backgroundResource = (R.drawable.bg_item_ic_status)

                }.lparams(width = wrapContent, height = wrapContent) {
                    alignParentEnd()
                    centerInParent()
                    marginEnd = dip(16)
                }
            }.lparams(width = matchParent, height = wrapContent)
        }
    }
}