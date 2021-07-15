package com.example.android_viewpager_kngrck.fragments

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView
import com.example.android_viewpager_kngrck.R


class SplashFragment : Fragment() {
    private lateinit var lottie: LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lottie = view.findViewById(R.id.campfireAnimation)
        addListeners()
    }

    private fun addListeners() {
        lottie.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                Log.v("Animation", "Started")
            }

            override fun onAnimationEnd(animation: Animator?) {
                Log.v("Animation", "End")
                findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
            }

            override fun onAnimationCancel(animation: Animator?) {
                Log.v("Animation", "Canceled")
            }

            override fun onAnimationRepeat(animation: Animator?) {
                Log.v("Animation", "Repeat")
            }
        })
    }

}