package jjh.movie.app.presentation.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.R
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import kotlin.math.abs

class RankingViewHolder(
    private val binding: ItemRankingBinding,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        with(binding) {
            root.setOnClickListener {

            }

            tvRanking.text = (movie.rank).toString()

            if (movie.rankIntensity == 0) {
                tvRankSame.visibility = View.VISIBLE
            } else {
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
