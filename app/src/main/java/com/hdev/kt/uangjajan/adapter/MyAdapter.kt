package com.hdev.kt.uangjajan.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hdev.kt.uangjajan.model.Items
import com.hdev.kt.uangjajan.ui.ItemUI
import org.jetbrains.anko.AnkoContext

class MyAdapter(private var items: List<Items>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = ViewHolder(ItemUI().createView(AnkoContext.Companion.create(parent.context, parent, false)))
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    //inner class
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val itemCard = itemView.findViewById<CardView>(ItemUI.id_card_view)
        private val itemAmount = itemView.findViewById<TextView>(ItemUI.id_text_amount)
        private val itemDescription = itemView.findViewById<TextView>(ItemUI.id_text_description)
        private val itemIcon = itemView.findViewById<ImageView>(ItemUI.id_icon)

        fun bindItem(item: Items) {

            itemAmount.text = item.amount
            itemDescription.text = item.description
            itemCard.changeTint(item.status)
            itemIcon.changeTint(item.status)
        }
    }
}