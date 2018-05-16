package com.cracky_axe.pxohlqo.udabake.ui

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.cracky_axe.pxohlqo.udabake.App
import com.cracky_axe.pxohlqo.udabake.R
import com.cracky_axe.pxohlqo.udabake.model.Recipe
import com.cracky_axe.pxohlqo.udabake.util.RecipeUtils
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import kotlinx.android.synthetic.main.activity_step.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class StepActivity : AppCompatActivity(), StepFragment.OnFragmentInteractionListener, ViewPager.OnPageChangeListener, AnkoLogger {

    lateinit var mRecipes: List<Recipe>
    private var recipeIndex: Int = 0
    var stepId: Int = 0

    lateinit var videoPlayer: ExoPlayer
    lateinit var stepPager: ViewPager
    lateinit var videoSource: MediaSource
    lateinit var dataSourceFactory: DefaultDataSourceFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step)

        setSupportActionBar(step_toolbar)

        mRecipes = (application as App).recipes

        recipeIndex = intent.extras.getInt(RecipeUtils.EXTRA_KEY_RECIPE_INDEX)
        step_toolbar_text_view.text = mRecipes[recipeIndex].name

        stepId = intent.extras.getInt(RecipeUtils.EXTRA_KEY_STEP_ID)

        var mainHandler = Handler()
        val bandwidthMeter = DefaultBandwidthMeter()
        val videoTrackSelectionFactory = AdaptiveTrackSelection.Factory(bandwidthMeter)
        val trackSelector = DefaultTrackSelector(videoTrackSelectionFactory)

        videoPlayer = ExoPlayerFactory.newSimpleInstance(this, trackSelector)
        step_video_playerview.player = videoPlayer
        dataSourceFactory = DefaultDataSourceFactory(this,
                Util.getUserAgent(this, getString(R.string.app_name)),
                bandwidthMeter)

        prepareStepPlayerMediaSourse()

        stepPager = step_fragment_pager
        stepPager.adapter = StepFragmentPagerAdapter(supportFragmentManager, mRecipes[recipeIndex])
        stepPager.addOnPageChangeListener(this)
        stepPager.currentItem = stepId
    }

    fun prepareStepPlayerMediaSourse() {
//        videoSource = ExtractorMediaSource.Factory(dataSourceFactory)
//                .createMediaSource(Uri.parse(mRecipes[recipeIndex].steps[stepId].videoURL))
        videoSource = ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.EMPTY)
        videoPlayer.prepare(videoSource)
    }

    override fun onDestroy() {
        super.onDestroy()
        videoPlayer.release()
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented")
    }

    fun nextStep(view: View) {
        stepId++
        stepPager.currentItem = stepId
        prepareStepPlayerMediaSourse()
    }

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        stepId = position
        prepareStepPlayerMediaSourse()
        info { "onPageScrolled called. Current step is $stepId" }
    }
}
