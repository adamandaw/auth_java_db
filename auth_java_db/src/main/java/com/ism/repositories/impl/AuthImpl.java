package com.ism.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ism.entities.UserEntity;
import com.ism.repositories.AuthReposytory;
import com.ism.repositories.DataBase;

public class AuthImpl implements AuthReposytory{
    private final String SQL_SELECT ="SELECT login,password FROM le_nom_de_votre_table WHERE login LIKE ? AND password LIKE ?";
    private DataBase database;

    




    public AuthImpl(DataBase database) {
        this.database = database;
    }






    @Override
    public UserEntity findUserByLoginPwd(String login,String pwd) {
         UserEntity user=null;
                  try {
                        database.openConnexion();
                        database.initPreparedStatement(SQL_SELECT);
                        database.getPs().setString(1,login);
                        database.getPs().setString(2,pwd);
                        ResultSet resultSet=database.executeSelect();
                        if (resultSet.next()) {
                             user=new UserEntity( 
                                             resultSet.getString("login"),
                                            resultSet.getString("password"));
                               
                          }
                       resultSet.close();
                       database.closeConnexion();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("Erreur execution de Requete");
                    }
                     return user;
    }}
