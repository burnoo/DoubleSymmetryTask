package dev.burnoo.dstask.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse(
    val data: Data
) {

    @Serializable
    data class Data(val sessions: List<NetworkSession>)
}
