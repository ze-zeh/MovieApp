package jjh.movie.app.presentation.model

import jjh.movie.app.presentation.model.MovieUiModel.Companion.dummyMovies


data class BoxOfficeUiModel(
    val key: Int = -1,
    val boxOfficeType: String = "BoxOfficeType",
    val name: String = "MovieName",
    val ranking: List<MovieUiModel> = listOf(),
) {
    companion object {
        val dummyBoxOffices = listOf(
            BoxOfficeUiModel(1, "일간 박스 오피스", "일간 박스 오피스 Top 10", dummyMovies),
            BoxOfficeUiModel(2, "주간 박스 오피스", "주간 박스 오피스 Top 10", dummyMovies),
            BoxOfficeUiModel(3, "독립 영화", "독립 영화 Top 10", dummyMovies),
        )
    }
}
