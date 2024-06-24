package com.kadukitesesi.seguranca.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("USERS")
public class User {

    @Id
    private String username;
    private String password;
}
