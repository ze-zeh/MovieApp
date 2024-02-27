package jjh.movie.app.presentation.home.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.R
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import jjh.movie.app.presentation.home.adapter.Movie
import kotlin.math.abs

class RankingViewHolder(
    private val binding: ItemRankingBinding,
    private val onMovieItemClickListener: () -> Unit,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        with(binding) {
            root.setOnClickListener {
                onMovieItemClickListener()
            }

            tvRanking.text = (movie.rank).toString()

            if (movie.rankIntensity == 0) {
                ivRankUpDown.visibility = View.GONE
                tvRankIntensity.visibility = View.GONE
            } else {
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
