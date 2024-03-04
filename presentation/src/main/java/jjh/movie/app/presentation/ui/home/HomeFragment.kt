package jjh.movie.app.presentation.ui.home

import android.content.ContentValues.TAG
import android.util.Log
import androidx.navigation.fragment.findNavController
import jjh.movie.app.presentation.databinding.FragmentHomeBinding
import jjh.movie.app.presentation.model.BoxOfficeUiModel.Companion.dummyBoxOffices
import jjh.movie.app.presentation.ui.base.BaseViewBindingFragment
import jjh.movie.app.presentation.ui.home.adapter.BoxOfficeAdapter

class HomeFragment : BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun initView() {
        with(binding) {
            val boxOfficeAdapter = BoxOfficeAdapter(
                onDetailClick = { boxOfficeType ->
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToDetailFragment(boxOfficeType),
                    )
                },
                onRankingClick = { movieKey ->
                    Log.d(TAG, "initView: ")
//                    findNavController().navigate(
//                        HomeFragmentDirections.actionHomeFragmentToMovieFragment(movieKey),
//                    )
                },
            )

            rvBoxOffice.adapter = boxOfficeAdapter
            boxOfficeAdapter.submitList(dummyBoxOffices)
        }
    }
}
