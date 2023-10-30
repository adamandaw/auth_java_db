package com.ism.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface DataBase {
        void openConnexion();
    void closeConnexion();
    ResultSet executeSelect();
    int executeUpdate();
    PreparedStatement getPs();
    void initPreparedStatement(String sql);
}
