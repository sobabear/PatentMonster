package com.yongjun.patentmonsters.model

data class USGrantedPatent(
    val abstractText: List<String>,
    val archiveURI: String?,
    val assigneeEntityName: String?,
    val assigneePostalAddressText: String?,
    val claimText: List<String>,
    val descriptionText: List<String>,
    val filelocationURI: String?,
    val filingDate: String?,
    val furtherCPCSymbolArrayText: String?,
    val grantDate: String?,
    val grantDocumentIdentifier: String?,
    val inventionSubjectMatterCategory: String?,
    val inventionTitle: String?,
    val inventorNameArrayText: List<String>,
    val mainCPCSymbolText: String?,
    val patentApplicationNumber: String?,
    val patentNumber: String?
)