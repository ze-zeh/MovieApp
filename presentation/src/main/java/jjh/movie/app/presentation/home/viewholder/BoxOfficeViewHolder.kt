package jjh.movie.app.presentation.home.viewholder

import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.databinding.ItemBoxOfficeBinding
import jjh.movie.app.presentation.home.adapter.BoxOffice
import jjh.movie.app.presentation.home.adapter.RankingAdapter

class BoxOfficeViewHolder(
    private val binding: ItemBoxOfficeBinding,
) :
    RecyclerView.ViewHolder(binding.root) {
    private val rankingAdapter by lazy {
        RankingAdapter()
    }

    fun bind(boxOffice: BoxOffice) {
        with(binding) {
            tvRankingTitle.text = boxOffice.name

            rvRanking.adapter = rankingAdapter
            rankingAdapter.submitList(boxOffice.ranking)
        }
    }
}
