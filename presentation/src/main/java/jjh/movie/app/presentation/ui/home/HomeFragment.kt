package jjh.movie.app.presentation.ui.home

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.databinding.FragmentHomeBinding
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment
import jjh.movie.app.presentation.ui.home.adapter.BoxOffice
import jjh.movie.app.presentation.ui.home.adapter.BoxOfficeAdapter
import jjh.movie.app.presentation.ui.home.adapter.Movie

class HomeFragment : BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private val boxOfficeAdapter by lazy {
        BoxOfficeAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initView() {
        with(binding) {
            rvBoxOffice.adapter = boxOfficeAdapter
            boxOfficeAdapter.submitList(dummyBoxOffices)
        }
    }

    companion object {
        private val dummyMovies = listOf(
            Movie(rank = 1, rankIntensity = 0),
            Movie(rank = 2, rankIntensity = -1),
            Movie(rank = 3, rankIntensity = 1),
            Movie(rank = 4, rankIntensity = 2),
            Movie(rank = 5, rankIntensity = 0),
            Movie(rank = 6, rankIntensity = -1),
            Movie(rank = 7, rankIntensity = 1),
            Movie(rank = 8, rankIntensity = 2),
            Movie(rank = 9, rankIntensity = 0),
            Movie(rank = 10, rankIntensity = -1),
        )

        private val dummyBoxOffices = listOf(
            BoxOffice(1, "일간 박스 오피스 Top 10", dummyMovies),
            BoxOffice(2, "주간 박스 오피스 Top 10", dummyMovies),
            BoxOffice(3, "독립 영화 Top 10", dummyMovies),
        )
    }
}
