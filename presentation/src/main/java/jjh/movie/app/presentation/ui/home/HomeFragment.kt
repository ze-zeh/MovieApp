package jjh.movie.app.presentation.ui.home

import androidx.navigation.fragment.findNavController
import jjh.movie.app.presentation.databinding.FragmentHomeBinding
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment
import jjh.movie.app.presentation.ui.home.adapter.BoxOffice
import jjh.movie.app.presentation.ui.home.adapter.BoxOfficeAdapter
import jjh.movie.app.presentation.ui.home.adapter.Movie

class HomeFragment : BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun initView() {
        with(binding) {
            val boxOfficeAdapter = BoxOfficeAdapter(
                detailClickListener = { boxOfficeType ->
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToDetailFragment(boxOfficeType),
                    )
                },
                movieClickListener = { movieKey ->
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToMovieFragment(movieKey),
                    )
                },
            )

            rvBoxOffice.adapter = boxOfficeAdapter
            boxOfficeAdapter.submitList(dummyBoxOffices)
        }
    }

    companion object {
        private val dummyMovies = listOf(
            Movie(key = 1, rank = 1, rankIntensity = 0),
            Movie(key = 2, rank = 2, rankIntensity = -1),
            Movie(key = 3, rank = 3, rankIntensity = 1),
            Movie(key = 4, rank = 4, rankIntensity = 2),
            Movie(key = 5, rank = 5, rankIntensity = 0),
            Movie(key = 6, rank = 6, rankIntensity = -1),
            Movie(key = 7, rank = 7, rankIntensity = 1),
            Movie(key = 8, rank = 8, rankIntensity = 2),
            Movie(key = 9, rank = 9, rankIntensity = 0),
            Movie(key = 10, rank = 10, rankIntensity = -1),
        )

        private val dummyBoxOffices = listOf(
            BoxOffice(1, "일간 박스 오피스", "일간 박스 오피스 Top 10", dummyMovies),
            BoxOffice(2, "주간 박스 오피스", "주간 박스 오피스 Top 10", dummyMovies),
            BoxOffice(3, "독립 영화", "독립 영화 Top 10", dummyMovies),
        )
    }
}
