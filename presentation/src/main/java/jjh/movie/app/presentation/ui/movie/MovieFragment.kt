package jjh.movie.app.presentation.ui.movie

import androidx.navigation.fragment.navArgs
import jjh.movie.app.presentation.databinding.FragmentMovieBinding
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment

class MovieFragment : BaseViewBindingFragment<FragmentMovieBinding>(FragmentMovieBinding::inflate) {
    private val safeArgs: MovieFragmentArgs by navArgs()

    override fun initView() {
        with(binding) {
            tvTest.text = "${safeArgs.movieKey}"
        }
    }
}
