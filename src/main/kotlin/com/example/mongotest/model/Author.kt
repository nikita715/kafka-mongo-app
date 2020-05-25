package com.example.mongotest.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Author(
        @Id val id: String,
        val name: String,
        val birthDate: LocalDate
)


