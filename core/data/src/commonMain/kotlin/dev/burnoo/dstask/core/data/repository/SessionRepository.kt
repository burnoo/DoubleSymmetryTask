package dev.burnoo.dstask.core.data.repository

import dev.burnoo.dstask.core.model.Session

interface SessionRepository {

    suspend fun getSessions(page: Int): Result<List<Session>>

    suspend fun searchSessions(query: String): Result<List<Session>>
}