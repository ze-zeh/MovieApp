package jjh.movie.app.presentation.ui.home.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.R
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import jjh.movie.app.presentation.ui.home.adapter.Movie
import kotlin.math.abs

class RankingViewHolder(
    private val binding: ItemRankingBinding,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        with(binding) {
            root.setOnClickListener {

            }

            ivMoviePoster.clipToOutline = true
            tvRanking.text = (movie.rank).toString()

            if (movie.rankIntensity == 0) {
                ivRankUpDown.visibility = View.INVISIBLE
                tvRankIntensity.visibility = View.INVISIBLE
                tvRankSame.visibility = View.VISIBLE
            } else {
                tvRankSame.visibility = View.INVISIBLE
                ivRankUpDown.visibility = View.VISIBLE
                tvRankIntensity.visibility = View.VISIBLE
                tvRankIntensity.text = abs(movie.rankIntensity).toString()

                if (movie.rankIntensity > 0) {
                    ivRankUpDown.setImageResource(R.drawable.ic_ranking_up)
                } else {
                    ivRankUpDown.setImageResource(R.drawable.ic_ranking_down)
                }
            }
        }
    }
}
