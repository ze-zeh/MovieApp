package jjh.movie.app.presentation.category

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.base.BaseViewBindingFragment
import jjh.movie.app.presentation.databinding.FragmentCategoryBinding

class CategoryFragment :
    BaseViewBindingFragment<FragmentCategoryBinding>(FragmentCategoryBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initView() {
        with(binding) {

        }
    }
}
