package com.cracky_axe.pxohlqo.udabake.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.cracky_axe.pxohlqo.udabake.App
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import com.cracky_axe.pxohlqo.udabake.util.RecipeUtils
import kotlinx.android.synthetic.main.activity_select_recipe.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.intentFor

class SelectRecipeActivity : AppCompatActivity(), SelectRecipeAdapter.SelectAdapterOnClickHandler, AnkoLogger {

    lateinit var mRecipes: List<Recipe>

    lateinit var  selectRecipeAdapter: SelectRecipeAdapter
    override fun onRecipeClick(recipeIndex: Int) {
        startActivity(intentFor<RecipeDetailActivity>(RecipeUtils.EXTRA_KEY_RECIPE_INDEX to recipeIndex))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_recipe)
        setSupportActionBar(select_recipe_toolbar)

        mRecipes = (application as App).recipes

        selectRecipeAdapter = SelectRecipeAdapter(mRecipes, this, this)
        val layoutManager = LinearLayoutManager(this)
        recyclerview_recipe_select.adapter = selectRecipeAdapter
        recyclerview_recipe_select.layoutManager = layoutManager
    }


}
