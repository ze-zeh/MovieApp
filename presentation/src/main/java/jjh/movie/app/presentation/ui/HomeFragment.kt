package jjh.movie.app.presentation.ui

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.databinding.FragmentHomeBinding
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment

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
            boxOfficeAdapter.submitList(textList)
        }
    }

    companion object {
        val textList = listOf(
            BoxOffice(
                0, "일간 박스 오피스", listOf(
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
            ),
            BoxOffice(
                0, "주간 박스 오피스", listOf(
                    Movie(rank = 1, rankIntensity = 0),
                    Movie(rank = 2, rankIntensity = -1),
                    Movie(rank = 3, rankIntensity = 1),
                    Movie(rank = 4, rankIntensity = 2),
                )
            ),
            BoxOffice(
                0, "독립 영화", listOf(
                    Movie(rank = 1, rankIntensity = 0),
                    Movie(rank = 2, rankIntensity = -1),
                    Movie(rank = 3, rankIntensity = 1),
                    Movie(rank = 4, rankIntensity = 2),
                )
            ),
        )
    }
}
