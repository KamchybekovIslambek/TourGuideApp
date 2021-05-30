package com.example.tourguide

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CategoryAdapter (val context: Context, val fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int) : Fragment {
        when (position) {
            0 -> return MonumentsFragment()
            1 -> return RestaurantsFragment()
            2 -> return ParksFragment()
        }
        return Fragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return context.getString(R.string.monuments)
            1 -> return context.getString(R.string.restaurants)
            2 -> return context.getString(R.string.parks)
        }
        return null
    }
}