/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class StudentDAO {
    
    public void addStudent(Student student) {
        
    String sql = "INSERT INTO students (first_name, last_name, age, email) VALUES (?, ?, ?, ?)";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, student.getFirstName());
        stmt.setString(2, student.getLastName());
        stmt.setInt(3, student.getAge());
        stmt.setString(4, student.getEmail());
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    }
    
    public List<Student> getAllStudents() {
        
    List<Student> students = new ArrayList<>();
    String sql = "SELECT * FROM students";
    try (Connection conn = DBConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            Student student = new Student(
            rs.getInt("student_id"),
            rs.getString("first_name"),
            rs.getString("last_name"),
            rs.getInt("age"),
            rs.getString("email")
            );
            students.add(student);
        }
             
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return students;
}
    
    public void deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement istitment = conn.prepareStatement(sql)) {
            
            istitment.setInt(1, studentId);
            int rowsAffected = istitment.executeUpdate();
            
            if(rowsAffected>0) {
                JOptionPane.showMessageDialog(null, "Student deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No student found with ID: " + studentId, "Delete Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Critical Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void updateStudent(Student student) {
        
        String sql = "UPDATE students SET first_name = ?, last_name = ?, age = ?, email = ? WHERE student_id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement istitment = conn.prepareStatement(sql); ){
            
            istitment.setString(1,student.getFirstName());
            istitment.setString(2,student.getLastName());
            istitment.setInt(3, student.getAge());
            istitment.setString(4, student.getEmail());
            istitment.setInt(5, student.getStudentID());
            
            int rowsAffected = istitment.executeUpdate();
            
            if (rowsAffected>0) {
                JOptionPane.showMessageDialog(null, "Student updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Update Failed. ID " + student.getStudentID()+ " not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Critical Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }
    
}



