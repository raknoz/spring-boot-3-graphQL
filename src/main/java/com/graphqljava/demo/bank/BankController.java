package com.graphqljava.demo.bank;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class BankController {

  private final BankService bankService;

  public BankController(final BankService bankService) {
    this.bankService = bankService;
  }

  @QueryMapping
  public BankAccount bankAccountById(@Argument UUID id) {
    return bankService.bankAccountById(id);
  }
}
