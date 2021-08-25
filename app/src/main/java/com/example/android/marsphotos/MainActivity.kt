

package com.example.android.marsphotos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.android.marsphotos.overview.OverviewFragment
import com.example.android.marsphotos.overview.WeatherFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val galleryFragment = OverviewFragment()
        val weatherFragment = WeatherFragment()


        makeCurrentFragment(galleryFragment)
        findViewById<BottomNavigationView>(R.id.bottom_nav).setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.gallery -> makeCurrentFragment(galleryFragment)
                R.id.weather -> makeCurrentFragment(weatherFragment)

            }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}

