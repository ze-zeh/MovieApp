package jjh.movie.app.presentation.model

data class MovieUiModel(
    val key: Int = -1,
    val rank: Int = 0,
    val name: String = "",
    val rankIntensity: Int = 0,
) {
    companion object {
        val dummyMovies = listOf(
            MovieUiModel(key = 1, rank = 1, rankIntensity = 0),
            MovieUiModel(key = 2, rank = 2, rankIntensity = -1),
            MovieUiModel(key = 3, rank = 3, rankIntensity = 1),
            MovieUiModel(key = 4, rank = 4, rankIntensity = 2),
            MovieUiModel(key = 5, rank = 5, rankIntensity = 0),
            MovieUiModel(key = 6, rank = 6, rankIntensity = -1),
            MovieUiModel(key = 7, rank = 7, rankIntensity = 1),
            MovieUiModel(key = 8, rank = 8, rankIntensity = 2),
            MovieUiModel(key = 9, rank = 9, rankIntensity = 0),
            MovieUiModel(key = 10, rank = 10, rankIntensity = -1),
        )
    }
}
