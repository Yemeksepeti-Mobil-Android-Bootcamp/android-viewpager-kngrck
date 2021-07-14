package com.example.android_viewpager_kngrck

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android_viewpager_kngrck.fragments.FirstFragment
import com.example.android_viewpager_kngrck.fragments.SecondFragment
import com.example.android_viewpager_kngrck.fragments.ThirdFragment

private const val FRAGMENT_COUNT = 3

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }
}