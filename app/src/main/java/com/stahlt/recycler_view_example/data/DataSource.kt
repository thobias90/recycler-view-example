package com.stahlt.recycler_view_example.data

import com.stahlt.recycler_view_example.R
import com.stahlt.recycler_view_example.model.Phrase

class DataSource {
    fun load(): List<Phrase> {
        return listOf<Phrase>(
            Phrase(R.string.phrase1),
            Phrase(R.string.phrase2),
            Phrase(R.string.phrase3),
            Phrase(R.string.phrase4),
            Phrase(R.string.phrase5),
            Phrase(R.string.phrase6),
            Phrase(R.string.phrase7),
            Phrase(R.string.phrase8),
            Phrase(R.string.phrase9),
            Phrase(R.string.phrase10)
        )
    }
}