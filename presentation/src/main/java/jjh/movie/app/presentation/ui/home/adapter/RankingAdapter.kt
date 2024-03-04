package jjh.movie.app.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import jjh.movie.app.presentation.model.MovieUiModel
import jjh.movie.app.presentation.ui.home.viewholder.RankingViewHolder

class RankingAdapter(
    private val onRankingClick: (Int) -> Unit,
) :
    ListAdapter<MovieUiModel, RankingViewHolder>(rankingDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankingViewHolder {
        return RankingViewHolder(
            binding = ItemRankingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            onRankingClick = onRankingClick,
        )
    }

    override fun onBindViewHolder(holder: RankingViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val rankingDiffCallback = object : DiffUtil.ItemCallback<MovieUiModel>() {
            override fun areItemsTheSame(oldItem: MovieUiModel, newItem: MovieUiModel): Boolean =
                oldItem.key == newItem.key

            override fun areContentsTheSame(oldItem: MovieUiModel, newItem: MovieUiModel): Boolean =
                oldItem == newItem
        }
    }
}
