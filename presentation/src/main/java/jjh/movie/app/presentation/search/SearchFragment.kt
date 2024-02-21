package jjh.movie.app.presentation.search

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.base.BaseViewBindingFragment
import jjh.movie.app.presentation.databinding.FragmentSearchBinding

class SearchFragment :
    BaseViewBindingFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {

    }
}