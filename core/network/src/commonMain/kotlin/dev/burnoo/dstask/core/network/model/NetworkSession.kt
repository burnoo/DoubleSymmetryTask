package dev.burnoo.dstask.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkSession(
    val name: String,
    val listener_count: Int,
    val genres: List<String>,
    val current_track: NetworkCurrentTrack
)

