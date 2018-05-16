package com.cracky_axe.pxohlqo.udabake.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.cracky_axe.pxohlqo.udabake.model.Recipe

class StepFragmentPagerAdapter(fm: FragmentManager, val dataSet: Recipe) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        val stepFragment = StepFragment.newInstance(dataSet.steps[position].description, dataSet.steps[position].id)

        return stepFragment
    }

    override fun getCount(): Int {
        return dataSet.steps.size
    }
}