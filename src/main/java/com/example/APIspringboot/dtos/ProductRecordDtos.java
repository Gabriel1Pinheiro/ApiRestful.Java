package com.example.APIspringboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDtos(@NotBlank String name, @NotNull BigDecimal value) {
}