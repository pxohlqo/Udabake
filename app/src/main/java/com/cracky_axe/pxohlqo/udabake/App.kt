package com.cracky_axe.pxohlqo.udabake

import android.app.Application
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class App : Application() {

    lateinit var recipes: List<Recipe>
        private set

    override fun onCreate() {
        super.onCreate()

        initializeMiriamMenu()
    }

    private fun initializeMiriamMenu() {
        val inputStream = assets.open("baking")
        val inputString = inputStream.bufferedReader().use { it.readText() }

        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java, Recipe::class.java)
        val jsonAdapter: JsonAdapter<List<Recipe>> = moshi.adapter(type)
        recipes = jsonAdapter.fromJson(inputString)!!
    }
}