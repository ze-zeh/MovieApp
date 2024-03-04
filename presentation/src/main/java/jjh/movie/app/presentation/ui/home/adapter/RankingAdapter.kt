package jjh.movie.app.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import jjh.movie.app.presentation.ui.home.viewholder.RankingViewHolder

class RankingAdapter(
    private val itemClickListener: (Int) -> Unit,
) :
    ListAdapter<Movie, RankingViewHolder>(rankingDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankingViewHolder {
        return RankingViewHolder(
            ItemRankingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            itemClickListener,
        )
    }

    override fun onBindViewHolder(holder: RankingViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val rankingDiffCallback = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem.key == newItem.key

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem == newItem
        }
    }
}

data class Movie(
    val key: Int = -1,
    val rank: Int = 0,
    val name: String = "MovieName",
    val rankIntensity: Int = 0,
)
