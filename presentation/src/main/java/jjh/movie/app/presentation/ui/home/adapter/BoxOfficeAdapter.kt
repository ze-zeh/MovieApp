package jjh.movie.app.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import jjh.movie.app.presentation.databinding.ItemBoxOfficeBinding
import jjh.movie.app.presentation.model.BoxOfficeUiModel
import jjh.movie.app.presentation.ui.home.viewholder.BoxOfficeViewHolder

class BoxOfficeAdapter(
    private val onDetailClick: (String) -> Unit,
    private val onRankingClick: (Int) -> Unit,
) : ListAdapter<BoxOfficeUiModel, BoxOfficeViewHolder>(boxOfficeDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxOfficeViewHolder {
        return BoxOfficeViewHolder(
            ItemBoxOfficeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            onDetailClick = onDetailClick,
            onRankingClick = onRankingClick,
        )
    }

    override fun onBindViewHolder(holder: BoxOfficeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val boxOfficeDiffCallback = object : DiffUtil.ItemCallback<BoxOfficeUiModel>() {
            override fun areItemsTheSame(
                oldItem: BoxOfficeUiModel,
                newItem: BoxOfficeUiModel
            ): Boolean = oldItem.key == newItem.key

            override fun areContentsTheSame(
                oldItem: BoxOfficeUiModel,
                newItem: BoxOfficeUiModel
            ): Boolean = oldItem == newItem
        }
    }
}
