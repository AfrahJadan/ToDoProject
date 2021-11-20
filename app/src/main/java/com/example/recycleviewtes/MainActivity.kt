    package com.example.recycleviewtes

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import androidx.navigation.NavController
    import androidx.navigation.fragment.NavHostFragment
    import androidx.navigation.ui.setupActionBarWithNavController
    import com.example.recycleviewtes.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
            lateinit var navController: NavController //add extend
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
    // add here for moving to author page
            val navController: NavController
            val navHostFragment = supportFragmentManager
                .findFragmentById(R.id.frag_cont_view) as NavHostFragment //change the id if layout
             navController = navHostFragment.navController
            setupActionBarWithNavController(navController)
        }
    }
