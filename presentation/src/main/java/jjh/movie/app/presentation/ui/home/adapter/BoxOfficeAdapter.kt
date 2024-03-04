package jjh.movie.app.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import jjh.movie.app.presentation.databinding.ItemBoxOfficeBinding
import jjh.movie.app.presentation.ui.home.viewholder.BoxOfficeViewHolder

class BoxOfficeAdapter(
    private val detailClickListener: (String) -> Unit,
    private val movieClickListener: (Int) -> Unit,
) : ListAdapter<BoxOffice, BoxOfficeViewHolder>(boxOfficeDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxOfficeViewHolder {
        return BoxOfficeViewHolder(
            ItemBoxOfficeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            detailClickListener,
            movieClickListener,
        )
    }

    override fun onBindViewHolder(holder: BoxOfficeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val boxOfficeDiffCallback = object : DiffUtil.ItemCallback<BoxOffice>() {
            override fun areItemsTheSame(oldItem: BoxOffice, newItem: BoxOffice): Boolean =
                oldItem.key == newItem.key

            override fun areContentsTheSame(oldItem: BoxOffice, newItem: BoxOffice): Boolean =
                oldItem.key == newItem.key

            override fun getChangePayload(oldItem: BoxOffice, newItem: BoxOffice): Boolean =
                oldItem.key == newItem.key
        }
    }
}

data class BoxOffice(
    val key: Int = -1,
    val boxOfficeType: String = "BoxOfficeType",
    val name: String = "MovieName",
    val ranking: List<Movie> = listOf(),
)
