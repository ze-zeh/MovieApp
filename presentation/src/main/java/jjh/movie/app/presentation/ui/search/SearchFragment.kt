package jjh.movie.app.presentation.ui.search

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment
import jjh.movie.app.presentation.databinding.FragmentSearchBinding

class SearchFragment :
    BaseViewBindingFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initView() {
        with(binding) {

        }
    }
}
