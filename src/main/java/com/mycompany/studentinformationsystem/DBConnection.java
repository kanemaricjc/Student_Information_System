/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationsystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Properties;
/**
 *
 * @author Acer
 */
public class DBConnection {
    
   
    public static Connection getConnection() throws IOException {
        Properties props = new Properties();
    
    try (FileInputStream in = new FileInputStream("db.properties")) {
        props.load(in);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Missing db.properties file!", "Config Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        return DriverManager.getConnection(
            props.getProperty("db.url"),
            props.getProperty("db.user"),
            props.getProperty("db.password")
        );
        
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Critical Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    }
}


