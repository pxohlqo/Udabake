package com.cracky_axe.pxohlqo.udabake

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class SelectRecipeAdapter(val context: Context, val mOnClickHandler: SelectAdapterOnClickHandler): RecyclerView.Adapter<SelectRecipeAdapter.SelectRecipeViewHolder>(), AnkoLogger {

    val mMiriamsMenu: MiriamsMenu = MiriamsMenu()


    interface SelectAdapterOnClickHandler {
        fun onClick(recipeIndex: Int)
    }

    inner class SelectRecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        override fun onClick(v: View?) {
            val position = adapterPosition
            mOnClickHandler.onClick(position)
        }

        val rootLayout: ConstraintLayout = itemView.findViewById(R.id.item_root_layout)

        val recipeNameTextView: TextView = itemView.findViewById(R.id.item_recipe_name)

        init {
            info { "init viewholder" }
            itemView.setOnClickListener(this)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectRecipeAdapter.SelectRecipeViewHolder{
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_view_select, parent, false)

        return SelectRecipeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mMiriamsMenu.recipres.size
    }

    override fun onBindViewHolder(holder: SelectRecipeViewHolder, position: Int) {
        holder.recipeNameTextView.text = mMiriamsMenu.recipres[position].recipeName
    }

}