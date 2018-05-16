package com.cracky_axe.pxohlqo.udabake.ui

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import org.jetbrains.anko.AnkoLogger

class RecipeDetailIngredientsAdapter(private val dataSet: List<Recipe.Ingredient>, private val context: Context) : RecyclerView.Adapter<RecipeDetailIngredientsAdapter.IngredientsViewHolder>(), AnkoLogger {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recipe_detail_ingredients, parent, false)

        return IngredientsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        if (position % 2 == 0) {
            holder.ingredientItemRootLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.darkGray))
        } else {
            holder.ingredientItemRootLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.lightGray))
        }

        holder.ingredientTextView.text = dataSet[position].ingredient
    }

    inner class IngredientsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ingredientTextView: TextView = itemView.findViewById(R.id.item_recipe_detail_ingredient_textview)
        val ingredientItemRootLayout: ConstraintLayout = itemView.findViewById(R.id.item_recipe_detail_root_layout)
    }
}