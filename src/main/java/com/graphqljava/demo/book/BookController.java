package com.graphqljava.demo.book;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
class BookController {

  private final BookService bookService;

  BookController(BookService bookService) {
    this.bookService = bookService;
  }

  /**
   * The @QueryMapping annotation binds this method to a query, a field under the Query type.
   * The query field is then determined from the method name, bookById.
   * It could also be declared on the annotation. Spring for GraphQL uses RuntimeWiring.Builder to register the handler
   * method as a graphql.schema.DataFetcher for the query field bookById.
   * -
   * In GraphQL Java, DataFetchingEnvironment provides access to a map of field-specific argument values.
   * Use the @Argument annotation to have an argument bound to a target object and injected into the handler method.
   * By default, the method parameter name is used to look up the argument.
   * The argument name can be specified in the annotation.
   *
   * @param id
   * @return Book
   */

  @QueryMapping
  public Book bookById(@Argument String id) {
    return bookService.getById(id);
  }
}
