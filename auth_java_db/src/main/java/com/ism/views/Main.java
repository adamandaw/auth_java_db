package com.ism.views;

import java.util.Scanner;

import com.ism.entities.UserEntity;
import com.ism.repositories.AuthReposytory;
import com.ism.repositories.DataBase;
import com.ism.repositories.impl.AuthImpl;
import com.ism.repositories.impl.MysqlImpl;
import com.ism.services.AuthService;
import com.ism.services.impl.AuthServiceImpl;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;  
      
        // INJECTION DE DEPENDANCE
        DataBase dataBase = new MysqlImpl();
        AuthReposytory authReposytory = new AuthImpl(dataBase);
        AuthService authService = new AuthServiceImpl(authReposytory);
        // FIN INJECTION DE DEP
        do {
        System.out.println("1. connectez vous :");
          choix=sc.nextInt();
            // choix = gestionClasseMenu();
            switch (choix) {
                case 1:
                    // System.out.println("vous ete au cas 1");
                      sc.nextLine();
                    System.out.println("login :");
                    String login = sc.nextLine();
                    System.out.println("cle :");
                    String cle =sc.nextLine();
                    if (authService.authentification(login,cle)) {
                        System.out.println("Authentification reussi");
             
                    } else{
                        System.out.println("Acces permanament refuser !");
                    }
                    break;
             
            
                default:
                    break;
            }
        } while (choix != 1);
    }
}