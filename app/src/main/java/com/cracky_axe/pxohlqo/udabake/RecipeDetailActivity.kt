package com.cracky_axe.pxohlqo.udabake

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.toast

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipeIndex = intent.extras.getInt("recipe index")
        toast(MiriamsMenu().recipres[recipeIndex].recipeName)
    }
}
