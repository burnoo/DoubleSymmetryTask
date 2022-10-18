package dev.burnoo.dstask.core.data.repository.fake

import dev.burnoo.dstask.core.data.repository.SessionRepository
import dev.burnoo.dstask.core.model.Session

internal class FakeSessionRepository : SessionRepository {

    override suspend fun getSessions(page: Int): Result<List<Session>> {
        return Result.success(fakeSessions)
    }

    override suspend fun searchSessions(query: String): Result<List<Session>> {
        return Result.success(fakeSessions.reversed())
    }
}