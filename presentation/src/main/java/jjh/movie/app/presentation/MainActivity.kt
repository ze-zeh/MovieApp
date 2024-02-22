package jjh.movie.app.presentation

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import jjh.movie.app.presentation.base.BaseViewBindingActivity
import jjh.movie.app.presentation.databinding.ActivityMainBinding

class MainActivity : BaseViewBindingActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private lateinit var host: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initNavigation()
    }

    private fun initNavigation() {
        host = supportFragmentManager.findFragmentById(R.id.container_main) as NavHostFragment
        navController = host.navController

        binding.bottomNavBar.setupWithNavController(navController)
    }
}