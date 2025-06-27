package dev.diminas.api_springboot.mapper;

import dev.diminas.api_springboot.dto.AuthDto;
import dev.diminas.api_springboot.entities.Users;
import org.springframework.stereotype.Component;

@Component
public final class AuthMapper {

    public Users map(AuthDto authDto){
        Users users = new Users();
        users.setEmail(authDto.email());
        users.setName(authDto.name());
        users.setUsername(authDto.username());
        users.setPassword(authDto.password());

        return users;
    }

    public AuthDto map(Users users){
        AuthDto authDto = new AuthDto(
                users.getEmail(),
                users.getName(),
                users.getUsername(),
                users.getPassword());
        return authDto;
    }

}
