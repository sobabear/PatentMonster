package com.yongjun.patentmonsters.model

data class USPublication(
    val results: List<USPublicationPatent>,
    val recordTotalQuantity: Int
)