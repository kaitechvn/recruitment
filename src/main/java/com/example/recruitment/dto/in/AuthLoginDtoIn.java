package com.example.recruitment.dto.in;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthLoginDtoIn {
  @NotEmpty
  private String username;

  @NotEmpty
  private String password;
}