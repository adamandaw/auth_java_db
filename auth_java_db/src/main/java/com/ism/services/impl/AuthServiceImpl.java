package com.ism.services.impl;

import com.ism.entities.UserEntity;
import com.ism.repositories.AuthReposytory;
import com.ism.services.AuthService;

public class AuthServiceImpl implements AuthService{
    private AuthReposytory authReposytory;

    public AuthServiceImpl(AuthReposytory authReposytory) {
        this.authReposytory = authReposytory;
    }

    @Override
    public boolean authentification(String login,String pwd) {
        if (authReposytory.findUserByLoginPwd(login,pwd)!=null) {
            return true;
        }
      
        return false;
    }
    
}
