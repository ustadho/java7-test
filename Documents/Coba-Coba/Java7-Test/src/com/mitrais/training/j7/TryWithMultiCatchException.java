package com.mitrais.training.j7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithMultiCatchException {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create-true", "TEST", "TEST");
            if(conn !=null){
                System.out.println("Connection established successfuly");
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
