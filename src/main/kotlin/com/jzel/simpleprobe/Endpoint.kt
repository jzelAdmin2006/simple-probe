package com.jzel.simpleprobe

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "endpoints")
data class Endpoint(
    @Id val id: String? = null,
    val url: String
)
