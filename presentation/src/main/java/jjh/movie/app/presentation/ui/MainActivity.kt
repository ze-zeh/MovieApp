package jjh.movie.app.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import jjh.movie.app.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()
    }

    private fun initNavigation() {
        with(binding) {
            navHostFragment =
                supportFragmentManager.findFragmentById(containerMain.id) as NavHostFragment?
                    ?: return
            navController = navHostFragment.navController
            bottomNavBar.setupWithNavController(navController)

            navController.addOnDestinationChangedListener { _, _, args ->
                bottomNavBar.isVisible = args?.getBoolean("is_bottom_nav_visible", true) ?: true
            }
        }
    }
}
