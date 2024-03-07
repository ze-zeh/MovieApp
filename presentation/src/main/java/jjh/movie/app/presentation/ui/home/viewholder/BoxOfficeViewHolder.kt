package jjh.movie.app.presentation.ui.home.viewholder

import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.databinding.ItemBoxOfficeBinding
import jjh.movie.app.presentation.model.BoxOfficeUiModel
import jjh.movie.app.presentation.ui.home.adapter.RankingAdapter

class BoxOfficeViewHolder(
    private val binding: ItemBoxOfficeBinding,
    private val onDetailClick: (String) -> Unit,
    private val onRankingClick: (Int) -> Unit,
) :
    RecyclerView.ViewHolder(binding.root) {
    private val rankingAdapter by lazy {
        RankingAdapter(
            onRankingClick = onRankingClick,
        )
    }

    fun bind(boxOffice: BoxOfficeUiModel) {
        with(binding) {
            btnRankingDetail.setOnClickListener {
                onDetailClick(
                    boxOffice.boxOfficeType,
                )
            }

            tvRankingTitle.text = boxOffice.name
            rvRanking.adapter = rankingAdapter
            rankingAdapter.submitList(boxOffice.ranking)
        }
    }
}
