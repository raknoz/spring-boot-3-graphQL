package com.graphqljava.demo.bank;

import lombok.Builder;

import java.util.UUID;

@Builder
public record BankAccount(UUID id, String name, Currency currency) {
}
