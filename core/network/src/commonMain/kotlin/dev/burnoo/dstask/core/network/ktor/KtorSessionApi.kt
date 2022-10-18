package dev.burnoo.dstask.core.network.ktor

import dev.burnoo.dstask.core.network.SessionDataSource
import dev.burnoo.dstask.core.network.model.NetworkResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json

class KtorSessionApi(engine: HttpClientEngine) : SessionDataSource {

    private val client = HttpClient(engine) {
        install(ContentNegotiation) {
            json()
        }
    }

    override suspend fun getSessions(page: Int): NetworkResponse {
        return client.get("https://www.mocky.io/v2/5df79a3a320000f0612e0115").body()
    }

    override suspend fun searchSessions(query: String): NetworkResponse {
        return client.get("https://www.mocky.io/v2/5df79b1f320000f4612e011e").body()
    }
}