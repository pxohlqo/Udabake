package com.cracky_axe.pxohlqo.udabake.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import org.jetbrains.anko.AnkoLogger

class RecipeDetialStepsAdapter(val dataSet: List<Recipe.Step>, val context: Context, val mOnClickHandler: RecipeDetailStepsOnClickHandler) : RecyclerView.Adapter<RecipeDetialStepsAdapter.StepsViewHolder>(), AnkoLogger {

    interface RecipeDetailStepsOnClickHandler {
        fun onStepClick(stepId: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StepsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recipe_detail_steps, parent, false)

        return StepsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: StepsViewHolder, position: Int) {
        holder.shortDescriptionTextView.text = dataSet[position].shortDescription
    }

    inner class StepsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            val position = adapterPosition
            mOnClickHandler.onStepClick(position)
        }

        val shortDescriptionTextView: TextView = itemView.findViewById(R.id.item_recipe_detail_steps_short_textview)

        init {
            itemView.setOnClickListener(this)
        }
    }
}