package com.cracky_axe.pxohlqo.udabake.ui

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class SelectRecipeAdapter(val dataSet: List<Recipe>, val context: Context, val mOnClickHandler: SelectAdapterOnClickHandler) : RecyclerView.Adapter<SelectRecipeAdapter.SelectRecipeViewHolder>(), AnkoLogger {


    interface SelectAdapterOnClickHandler {
        fun onRecipeClick(recipeIndex: Int)
    }

    inner class SelectRecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        override fun onClick(v: View?) {
            val position = adapterPosition
            mOnClickHandler.onRecipeClick(position)
        }

        val rootLayout: ConstraintLayout = itemView.findViewById(R.id.item_root_layout)

        val recipeNameTextView: TextView = itemView.findViewById(R.id.item_recipe_name)

        val backgroundImageView: ImageView = itemView.findViewById(R.id.item_recipe_background_imageview)

        init {
            info { "init viewholder" }
            itemView.setOnClickListener(this)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectRecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recipe_select, parent, false)

        return SelectRecipeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: SelectRecipeViewHolder, position: Int) {
        holder.recipeNameTextView.text = dataSet[position].name
        holder.backgroundImageView.setImageDrawable(loadImageBackgroundAsDrawable(position))
    }

    fun loadImageBackgroundAsDrawable(recipeIndex: Int): Drawable? {
        var drawable: Drawable? = null
        try {
            val inputStream = context.assets.open(dataSet[recipeIndex].image)
            drawable = Drawable.createFromStream(inputStream, null)
        } catch (e: Exception) {
            drawable = ColorDrawable(ContextCompat.getColor(context, R.color.brown))
        }
        return drawable
    }

}