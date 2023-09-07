package com.dicoding.myapplication

import android.os.Bundle
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val linearLayout = findViewById<LinearLayout>(R.id.detail_linear_layout)

        linearLayout.visibility = View.VISIBLE
        linearLayout.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))


        val heroName = intent.getStringExtra("HERO_NAME")
        val heroNickname = intent.getStringExtra("HERO_NICKNAME")
        val heroDescription = intent.getStringExtra("HERO_DESCRIPTION")
        val heroImageResId = intent.getIntExtra("HERO_IMAGE", 0)
        val heroBounty = intent.getStringExtra("HERO_BOUNTY")

        val imgHeroDetail = findViewById<ImageView>(R.id.img_hero_detail)
        val tvHeroNameDetail = findViewById<TextView>(R.id.tv_hero_name_detail)
        val tvHeroNicknameDetail = findViewById<TextView>(R.id.tv_hero_nickname_detail) // Find nickname TextView
        val tvHeroDescriptionDetail = findViewById<TextView>(R.id.tv_hero_description_detail)
        val tvHeroBountyDetail = findViewById<TextView>(R.id.tv_hero_bounty_detail)

        imgHeroDetail.setImageResource(heroImageResId)
        tvHeroNameDetail.text = heroName
        tvHeroNicknameDetail.text = heroNickname // Set nickname text
        tvHeroDescriptionDetail.text = heroDescription
        tvHeroBountyDetail.text = heroBounty

        val toolbar = findViewById<Toolbar>(R.id.toolbar_detail)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.title = ""
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}