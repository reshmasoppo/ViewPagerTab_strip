package com.example.viewpagertab_strip

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm)
{


private val COUNT = 2

override fun getItem(position: Int): Fragment {
    var fragment: Fragment? = null
    when (position) {
        0 -> fragment = First1Fragment()
        1 -> fragment = SecondFragment()

    }

    return fragment!!
}

override fun getCount(): Int {
    return COUNT
}

override fun getPageTitle(position: Int): CharSequence? {
    return "Tab " + (position + 1)
}
}

