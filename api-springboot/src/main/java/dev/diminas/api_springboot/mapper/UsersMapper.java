package dev.diminas.api_springboot.mapper;

import dev.diminas.api_springboot.dto.UsersDto;
import dev.diminas.api_springboot.entities.Users;
import org.springframework.stereotype.Component;

@Component
public final class UsersMapper {

    public Users map(UsersDto userDto){
        Users users = new Users();
        users.setId(userDto.id());
        users.setEmail(userDto.email());
        users.setName(userDto.name());
        users.setUsername(userDto.username());
        users.setPassword(userDto.password());
        users.setTypeUser(userDto.typeUser());
        return users;
    }

    public UsersDto map(Users users){
        UsersDto userDto =  new UsersDto(
                users.getId(),
                users.getEmail(),
                users.getName(),
                users.getUsername(),
                users.getPassword(),
                users.getTypeUser());
        return userDto;
    }
}
