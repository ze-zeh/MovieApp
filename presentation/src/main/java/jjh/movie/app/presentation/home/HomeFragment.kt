package jjh.movie.app.presentation.home

import android.os.Bundle
import android.view.View
import jjh.movie.app.presentation.base.BaseViewBindingFragment
import jjh.movie.app.presentation.databinding.FragmentHomeBinding
import jjh.movie.app.presentation.home.adapter.Movie
import jjh.movie.app.presentation.home.adapter.RankingAdapter

class HomeFragment : BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private val rankingAdapter by lazy {
        RankingAdapter(onMovieItemClickListener = {
            onMovieItemClickListener()
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initView() {
        with(binding) {
            rvDailyTop.adapter = rankingAdapter

            rankingAdapter.submitList(
                listOf(
                    Movie(rank = 1, rankIntensity = 0),
                    Movie(rank = 2,  rankIntensity = -1),
                    Movie(rank = 3,  rankIntensity = 1),
                    Movie(rank = 4,  rankIntensity = 2),
                )
            )
        }
    }

    private fun onMovieItemClickListener() {

    }
}
