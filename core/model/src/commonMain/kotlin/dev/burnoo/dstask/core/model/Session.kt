package dev.burnoo.dstask.core.model

data class Session(
    val name: String,
    val listenerCount: Int,
    val genres: List<Genre>,
    val currentTrack: CurrentTrack
)