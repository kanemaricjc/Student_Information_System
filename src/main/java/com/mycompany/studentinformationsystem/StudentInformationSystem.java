/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentinformationsystem;

/**
 *
 * @author Acer
 */
public class StudentInformationSystem {

    public static void main(String[] args) {
        
    com.formdev.flatlaf.FlatLightLaf.setup(); // Or FlatDarkLaf
    java.awt.EventQueue.invokeLater(() -> {
        new StudentGUI().setVisible(true);
    });
        
    }
}
