package com.example.mongotest.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Book(
        @Id val isbn: String,
        val name: String,
        var author: Author,
        val publishedYear: Int
)