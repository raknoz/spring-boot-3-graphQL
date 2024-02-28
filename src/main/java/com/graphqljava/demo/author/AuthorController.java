package com.graphqljava.demo.author;

import com.graphqljava.demo.book.Book;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

  private final AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  /**
   * The @SchemaMapping annotation maps a handler method to a field in the GraphQL schema and declares
   * it to be the DataFetcher for that field. The field name defaults to the method name,
   * and the type name defaults to the simple class name of the source/parent object injected into the method.
   * In this example, the field defaults to author and the type defaults to Book.
   * The type and field can be specified in the annotation.
   *
   * @param book
   * @return
   */
  @SchemaMapping
  public Author author(Book book) {
    return authorService.getById(book.authorId());
  }
}
