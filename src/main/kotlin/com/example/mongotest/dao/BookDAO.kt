package com.example.mongotest.dao

import com.example.mongotest.model.Book
import org.springframework.data.mongodb.repository.MongoRepository

interface BookDAO : MongoRepository<Book, String> {
    fun findByAuthorId(id: String): List<Book>
    fun findByNameRegex(name: String): List<Book>
}