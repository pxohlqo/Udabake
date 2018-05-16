package com.cracky_axe.pxohlqo.udabake.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.cracky_axe.pxohlqo.udabake.App
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import com.cracky_axe.pxohlqo.udabake.util.RecipeUtils
import kotlinx.android.synthetic.main.activity_recipe_detail.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class RecipeDetailActivity : AppCompatActivity(), RecipeDetialStepsAdapter.RecipeDetailStepsOnClickHandler, AnkoLogger {
    lateinit var mRecipes: List<Recipe>
    private var recipeIndex: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        setSupportActionBar(recipe_detail_toolbar)
        recipeIndex = intent.extras.getInt(RecipeUtils.EXTRA_KEY_RECIPE_INDEX)
        mRecipes = (application as App).recipes
        toast(mRecipes[recipeIndex].name)
        recipe_detail_toolbar_text_view.text = mRecipes[recipeIndex].name

        recipe_detail_ingredients_recyclerview.layoutManager = LinearLayoutManager(this)
        val recipeDetailIngredientsAdapter = RecipeDetailIngredientsAdapter(mRecipes[recipeIndex].ingredients, this)
        recipe_detail_ingredients_recyclerview.adapter = recipeDetailIngredientsAdapter

        recipe_detail_steps_recyclerview.layoutManager = LinearLayoutManager(this)
        val recipeDetailStepsAdapter = RecipeDetialStepsAdapter(mRecipes[recipeIndex].steps, this, this)
        recipe_detail_steps_recyclerview.adapter = recipeDetailStepsAdapter
    }

    override fun onStepClick(stepId: Int) {
        startActivity(intentFor<StepActivity>(RecipeUtils.EXTRA_KEY_RECIPE_INDEX to recipeIndex, RecipeUtils.EXTRA_KEY_STEP_ID to stepId))
    }
}
