package com.books.demo.controllers

import com.books.demo.entities.Book
import com.books.demo.repositories.BookRepository
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val repo: BookRepository)
{

    @PostMapping("/book")
    fun addBooks(@RequestBody book : Book){
      repo.save(book)
    }

    @GetMapping("/book")
    fun getAllBooks() = repo.findAll().toList()

    @GetMapping("/book/{title}")
    fun getBookbyTitle( @PathVariable("title") title: String) = repo.findBYTitle(title)


}