package com.hdev.kt.uangjajan.ui

import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.hdev.kt.uangjajan.R
import com.hdev.kt.uangjajan.activity.MainActivity
import com.hdev.kt.uangjajan.adapter.MyAdapter
import com.hdev.kt.uangjajan.model.Items
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainUI(private val items: List<Items>) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        //LinearLayout
        verticalLayout {
            orientation = LinearLayout.VERTICAL
            backgroundResource = attr(R.attr.selectableItemBackground).resourceId
            isClickable = true

            //TextView Title
            textView {
                textSize = 24f
                textColor = Color.BLACK
                text = resources.getString(R.string.title)

            }.lparams { leftMargin = dip(16) }

            //TextView Subtitle
            textView { text = resources.getString(R.string.subtitle) }.lparams {
                bottomMargin = dip(16)
                leftMargin = dip(16)
            }

            //RecyclerView
            recyclerView {
                lparams(matchParent, matchParent)
                layoutManager = LinearLayoutManager(context)
                adapter = MyAdapter(items)
            }
        }
    }
}