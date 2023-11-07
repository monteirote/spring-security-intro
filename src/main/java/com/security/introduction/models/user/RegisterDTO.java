package com.security.introduction.models.user;

public record RegisterDTO(String login, String password, UserRole role)  {
}
