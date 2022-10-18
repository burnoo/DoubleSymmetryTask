package dev.burnoo.dstask.core.data.repository.fake

import dev.burnoo.dstask.core.model.ArtworkUrl
import dev.burnoo.dstask.core.model.CurrentTrack
import dev.burnoo.dstask.core.model.Genre
import dev.burnoo.dstask.core.model.Session

internal val fakeSessions = listOf(
    Session(
        name = "jazz",
        listenerCount = 229,
        genres = listOf(Genre("Jazz")),
        currentTrack = CurrentTrack(
            title = "Passage",
            artworkUrl = ArtworkUrl("https://i.scdn.co/image/05c1c3fa2e2cca7011c8c94751d7f21f4aff5b54")
        )
    ),
    Session(
        name = "chillhop",
        listenerCount = 112,
        genres = listOf(
            Genre("Hip-Hop/Rap"), Genre("Old School Rap"), Genre("Electronic")
        ),
        currentTrack = CurrentTrack(
            title = "Passage",
            artworkUrl = ArtworkUrl("https://i.scdn.co/image/05c1c3fa2e2cca7011c8c94751d7f21f4aff5b54")
        )
    ),
    Session(
        name = "kpop",
        listenerCount = 89,
        genres = listOf(
            Genre("K-Pop"), Genre("Hip-Hop/Rap"), Genre("Pop")
        ),
        currentTrack = CurrentTrack(
            title = "BTS - DNA",
            artworkUrl = ArtworkUrl("https://i1.sndcdn.com/artworks-000243103372-ohcc17-large.jpg")
        )
    ),
)