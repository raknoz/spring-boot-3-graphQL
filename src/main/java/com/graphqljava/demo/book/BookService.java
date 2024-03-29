package com.graphqljava.demo.book;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

  private static final List<Book> books = Arrays.asList(
      new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
      new Book("book-2", "Moby Dick", 635, "author-2"),
      new Book("book-3", "Interview with the vampire", 371, "author-3")
  );

  public Book getById(String id) {
    return books.stream().filter(book -> book.id().equals(id)).findFirst().orElse(null);
  }
}
