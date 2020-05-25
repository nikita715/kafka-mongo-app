package com.example.mongotest.dao

import com.example.mongotest.model.Author
import org.springframework.data.mongodb.repository.MongoRepository

interface AuthorDAO : MongoRepository<Author, String>
