package com.example.mongotest

import com.example.mongotest.dao.AuthorDAO
import com.example.mongotest.dao.BookDAO
import com.example.mongotest.model.Author
import com.example.mongotest.model.Book
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDate

@SpringBootTest
class MongoTests {

    @Autowired
    private lateinit var authorDAO: AuthorDAO

    @Autowired
    private lateinit var bookDAO: BookDAO

    @Test
    fun mongoTest() {
        bookDAO.deleteAll()
        authorDAO.deleteAll()
        val author = Author("1", "Voltaire", LocalDate.of(1770, 1, 15))
        authorDAO.insert(author)
        val book = Book("5436635", "A Book", author, 1790)
        bookDAO.insert(book)
    }
}
