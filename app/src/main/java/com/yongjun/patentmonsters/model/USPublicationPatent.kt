package com.yongjun.patentmonsters.model

data class USPublicationPatent(
    val abstractText: List<String>,
    val archiveURI: String?,
    val assigneeEntityName: String?,
    val assigneePostalAddressText: String?,
    val claimText: List<String>,
    val descriptionText: List<String>,
    val filelocationURI: String?,
    val filingDate: String?,
    val furtherCPCSymbolArrayText: String?,
    val publicationDate: String?,
    val publicationDocumentIdentifier: String?,
    val inventionSubjectMatterCategory: String?,
    val inventionTitle: String?,
    val inventorNameArrayText: List<String>,
    val mainCPCSymbolText: String?,
    val patentApplicationNumber: String?,
    val patentNumber: String?
)