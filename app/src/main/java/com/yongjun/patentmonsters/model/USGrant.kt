package com.yongjun.patentmonsters.model

data class USGrant(
    val results: List<USGrantedPatent>,
    val recordTotalQuantity: Int
)