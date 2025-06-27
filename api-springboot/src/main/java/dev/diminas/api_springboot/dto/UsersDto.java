package dev.diminas.api_springboot.dto;

import dev.diminas.api_springboot.enums.UsersEnum;

import java.util.UUID;

public record UsersDto(UUID id, String email, String password, String name, String username, UsersEnum typeUser) {
}
