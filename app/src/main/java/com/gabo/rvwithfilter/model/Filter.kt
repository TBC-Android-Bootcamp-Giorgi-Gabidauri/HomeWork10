package com.gabo.rvwithfilter.model

data class Filter(
    val img: Int,
    val filterName: String,
    var bgColor: Int,
    var txtColor: Int,
    var isActive: Boolean = false
)