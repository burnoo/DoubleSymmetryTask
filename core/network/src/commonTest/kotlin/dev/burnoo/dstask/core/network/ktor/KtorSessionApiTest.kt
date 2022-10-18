package dev.burnoo.dstask.core.network.ktor

import dev.burnoo.dstask.core.network.utls.sessionsResponseJson
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteReadChannel

class KtorSessionApiTest : FunSpec({

    val engine = MockEngine {
        respond(
            content = ByteReadChannel(sessionsResponseJson),
            status = HttpStatusCode.OK,
            headers = headersOf(HttpHeaders.ContentType, "application/json")
        )
    }
    val api = KtorSessionApi(engine = engine)

    test("should parse get sessions response") {
        val response = api.getSessions(page = 0)
        response.data.sessions.size shouldBe 10
    }

    test("should parse search sessions response") {
        val response = api.searchSessions(query = "test")
        response.data.sessions.size shouldBe 10
    }
})