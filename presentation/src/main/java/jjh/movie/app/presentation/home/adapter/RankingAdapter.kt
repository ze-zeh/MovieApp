package jjh.movie.app.presentation.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jjh.movie.app.presentation.databinding.ItemRankingBinding
import jjh.movie.app.presentation.home.viewholder.RankingViewHolder

class RankingAdapter : ListAdapter<Movie, RecyclerView.ViewHolder>(rankingDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RankingViewHolder(
            ItemRankingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is RankingViewHolder) {
            holder.bind(getItem(position))
        }
    }

    companion object {
        val rankingDiffCallback = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem.key == newItem.key

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem.key == newItem.key

            override fun getChangePayload(oldItem: Movie, newItem: Movie): Boolean =
                oldItem.key == newItem.key
        }
    }
}

data class Movie(
    val key: Int = -1,
    val rank: Int = 0,
    val name: String = "MovieName",
    val rankIntensity: Int = 0,
)
