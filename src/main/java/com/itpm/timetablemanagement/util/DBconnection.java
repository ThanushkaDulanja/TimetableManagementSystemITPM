/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THANUSHKA
 */
public class DBconnection {
    private static Connection connection;
    
     static Connection getConnection(){
        
        try {
            if(connection == null || connection.isClosed()){
                
                Class.forName("org.sqlite.JDBC");
                
                connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\THANUSHKA\\OneDrive\\Documents\\NetBeansProjects\\TimetableManagementSystem-ITPM_Project\\src\\database\\Test.db");
                System.out.println("connection success");
                return connection;
            }
            else{
                return connection;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex.getMessage());
            return null;
        }
        
    }
}