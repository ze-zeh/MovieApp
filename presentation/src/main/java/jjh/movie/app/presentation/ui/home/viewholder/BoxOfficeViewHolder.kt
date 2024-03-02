package jjh.movie.app.presentation.ui.home.viewholder

import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.databinding.ItemBoxOfficeBinding
import jjh.movie.app.presentation.ui.home.adapter.BoxOffice
import jjh.movie.app.presentation.ui.home.adapter.RankingAdapter

class BoxOfficeViewHolder(
    private val binding: ItemBoxOfficeBinding,
    private val detailClickListener: (String) -> Unit,
    private val movieClickListener: (Int) -> Unit,
) :
    RecyclerView.ViewHolder(binding.root) {
    private val rankingAdapter by lazy {
        RankingAdapter(
            movieClickListener,
        )
    }

    fun bind(boxOffice: BoxOffice) {
        with(binding) {
            btnRankingDetail.setOnClickListener {
                detailClickListener(
                    boxOffice.boxOfficeType,
                )
            }

            tvRankingTitle.text = boxOffice.name

            rvRanking.adapter = rankingAdapter
            rankingAdapter.submitList(boxOffice.ranking)
        }
    }
}
