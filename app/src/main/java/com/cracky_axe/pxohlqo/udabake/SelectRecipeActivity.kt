package com.cracky_axe.pxohlqo.udabake

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_select_recipe.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.intentFor

class SelectRecipeActivity : AppCompatActivity(), SelectRecipeAdapter.SelectAdapterOnClickHandler, AnkoLogger {

    lateinit var  selectRecipeAdapter: SelectRecipeAdapter
    override fun onClick(recipeIndex: Int) {
        startActivity(intentFor<RecipeDetailActivity>("recipe index" to recipeIndex))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_recipe)
        setSupportActionBar(tool_bar)

        selectRecipeAdapter = SelectRecipeAdapter(this, this)
        val layoutManager = LinearLayoutManager(this)
        recyclerview_recipe_select.adapter = selectRecipeAdapter
        recyclerview_recipe_select.layoutManager = layoutManager
    }
}
