package jjh.movie.app.presentation.ui.detail

import androidx.navigation.fragment.navArgs
import jjh.movie.app.presentation.databinding.FragmentDetailBinding
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment

class DetailFragment :
    BaseViewBindingFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {
    private val safeArgs: DetailFragmentArgs by navArgs()

    override fun initView() {
        with(binding) {
            tvTest.text = safeArgs.boxOfficeType
        }
    }
}
