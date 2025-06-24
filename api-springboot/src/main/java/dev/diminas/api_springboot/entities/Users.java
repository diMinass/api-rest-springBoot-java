package dev.diminas.api_springboot.entities;

import dev.diminas.api_springboot.enums.UsersEnum;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 30, nullable = false)
    private String name;
    @Column(length = 20, unique = true)
    private String username;
    @Enumerated(EnumType.ORDINAL)
    private UsersEnum typeUser;

    public Users() {
    }

    public Users(UUID id, String email, String password, String name, String username, UsersEnum typeUser) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.username = username;
        this.typeUser = typeUser;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UsersEnum getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(UsersEnum typeUser) {
        this.typeUser = typeUser;
    }
}
