package com.stahlt.recycler_view_example.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Phrase(@StringRes val stringResourceId: Int,@DrawableRes val imgResourceId: Int)