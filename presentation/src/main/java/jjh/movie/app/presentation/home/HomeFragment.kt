package jjh.movie.app.presentation.home

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.base.BaseViewBindingFragment
import jjh.movie.app.presentation.databinding.FragmentHomeBinding

class HomeFragment : BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {
        with(binding) {
            
        }
    }
}