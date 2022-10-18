package dev.burnoo.dstask.core.network

import dev.burnoo.dstask.core.network.model.NetworkResponse

interface SessionDataSource {

    suspend fun getSessions(page: Int) : NetworkResponse

    suspend fun searchSessions(query: String) : NetworkResponse
}