package com.graphqljava.demo.author;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthorService {

  private static final List<Author> authors = Arrays.asList(
      new Author("author-1", "Joanne", "Rowling"),
      new Author("author-2", "Herman", "Melville"),
      new Author("author-3", "Anne", "Rice")
  );

  public Author getById(String id) {
    return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
  }
}
