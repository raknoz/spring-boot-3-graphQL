package com.graphqljava.demo.bank;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class BankService {

  private static final List<BankAccount> bankAccounts = Arrays.asList(
      new BankAccount(UUID.fromString("666b94b9-04fd-4ebb-8f4f-67882d0b880f"), "Davincho", Currency.EUR),
      new BankAccount(UUID.fromString("b94f245a-f0bf-4c04-83c5-c74f8a8baeb0"), "John Doe", Currency.USD),
      new BankAccount(UUID.fromString("6ba583b9-e700-440e-a214-0ea00718729d"), "Pepe Argento", Currency.ARS)
  );

  public BankAccount bankAccountById(final UUID id) {
    return bankAccounts.stream().filter(ba -> ba.id().equals(id)).findFirst().orElse(null);
  }
}
