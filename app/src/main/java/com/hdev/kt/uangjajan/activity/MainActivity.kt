package com.hdev.kt.uangjajan.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.hdev.kt.uangjajan.R
import com.hdev.kt.uangjajan.model.Items
import com.hdev.kt.uangjajan.ui.MainUI
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Items> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setDisplayShowTitleEnabled(false)
            elevation = 0f
        }

        items.apply {
            add(Items("Rp. 1.000.000", "Beli meja informa yang lagi diskon 20%", "success"))
            add(Items("Rp. 899.000", "Kursi gaming yang bisa tiduran", "success"))
            add(Items("Rp. 10.000.000", "Hedon", "failed"))
            add(Items("Rp. 1.200.000", "Langganan 90 hari kelas dicoding", "success"))
            add(Items("Rp. 250.000", "KUA", "pending"))
        }

        MainUI(items).setContentView(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}
