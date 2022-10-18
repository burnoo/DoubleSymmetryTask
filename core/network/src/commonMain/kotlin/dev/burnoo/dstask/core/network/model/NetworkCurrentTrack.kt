package dev.burnoo.dstask.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkCurrentTrack(
    val title: String,
    val artwork_url: String
)