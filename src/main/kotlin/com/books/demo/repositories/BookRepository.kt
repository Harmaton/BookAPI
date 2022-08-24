package com.books.demo.repositories

import com.books.demo.entities.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<Book, Long>{
 fun findBYTitle(title: String): Book
}