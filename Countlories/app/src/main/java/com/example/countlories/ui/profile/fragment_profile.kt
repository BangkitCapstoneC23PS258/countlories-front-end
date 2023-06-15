package com.example.countlories.ui.profile

import FavoriteFragment
import TrackFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.countlories.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var namaUserTextView: TextView
    private lateinit var tinggiBadanTextView: TextView
    private lateinit var beratTextView: TextView
    private lateinit var umurTextView: TextView
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)

        namaUserTextView = findViewById(R.id.namaUserTextView)
        tinggiBadanTextView = findViewById(R.id.tinggiBadanTextView)
        beratTextView = findViewById(R.id.beratTextView)
        umurTextView = findViewById(R.id.umurTextView)

        // Mengatur informasi pengguna
        namaUserTextView.text = "Nama User"
        tinggiBadanTextView.text = "Tinggi Badan"
        beratTextView.text = "Berat"
        umurTextView.text = "Umur"

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        // Mengatur adapter untuk ViewPager
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Track"
                1 -> "Favorite"
                else -> ""
            }
        }.attach()
    }

    private inner class ViewPagerAdapter(fragmentManager: FragmentManager) :
        FragmentStateAdapter(fragmentManager, lifecycle) {

        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> TrackFragment()
                1 -> FavoriteFragment()
                else -> throw IllegalArgumentException("Invalid position")
            }
        }
    }
}
