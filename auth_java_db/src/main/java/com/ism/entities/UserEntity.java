package com.ism.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
    private int id;
    private String login;
    private String pwd;
    public UserEntity(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }
}
