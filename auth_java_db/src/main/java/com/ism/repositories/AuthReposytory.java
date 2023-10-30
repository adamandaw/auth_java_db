package com.ism.repositories;

import com.ism.entities.UserEntity;

public interface AuthReposytory {
    UserEntity findUserByLoginPwd(String login,String pwd);
}
