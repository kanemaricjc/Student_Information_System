package com.mycompany.studentinformationsystem;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StudentGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentGUI.class.getName());

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        model.setRowCount(0);
        
        StudentDAO dao = new StudentDAO();
        List<Student> list = dao.getAllStudents();
        
        for (Student s:list) {
            Object[] row = {
                s.getStudentID(),
                s.getFirstName(),
                s.getLastName(),
                s.getAge(),
                s.getEmail()
            };
            model.addRow(row);
        }
    }
    
    private void resizePanel(int width, int height) {
        Dimension newSize = new Dimension(width,height);
        
        jPanel4.setPreferredSize(newSize);
        jPanel4.setMinimumSize(newSize);
        
        this.pack();
        
    }
    
    public StudentGUI() {
        initComponents();
        jPanel4.setBorder(new com.formdev.flatlaf.ui.FlatLineBorder(
        new java.awt.Insets(20, 20, 20, 20), // Padding (Top, Left, Bottom, Right)
        new java.awt.Color(220, 220, 220),   // Light gray border color
        1,                                   // Border thickness
        15                                   // Rounded corner radius (arc)
    ));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        homeBTN = new javax.swing.JButton();
        addStudentBTN = new javax.swing.JButton();
        updateStudentBTN = new javax.swing.JButton();
        delStudentBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        welcomeCard = new javax.swing.JPanel();
        showStudentListBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addStudentCard = new javax.swing.JPanel();
        addNewStudentLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        tableCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        updateStudentCard = new javax.swing.JPanel();
        updateStudentLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        firstName1Label = new javax.swing.JLabel();
        firstName1Field = new javax.swing.JTextField();
        lastName1Label = new javax.swing.JLabel();
        lastName1Field = new javax.swing.JTextField();
        age1Label = new javax.swing.JLabel();
        age1Field = new javax.swing.JTextField();
        email1Label = new javax.swing.JLabel();
        email1Field = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteStudentCard = new javax.swing.JPanel();
        deleteStudentLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        IdDeleteLabel = new javax.swing.JLabel();
        IdDeleteField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        homeBTN.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        homeBTN.setForeground(new java.awt.Color(100, 100, 100));
        homeBTN.setText("Home");
        homeBTN.setBorderPainted(false);
        homeBTN.setContentAreaFilled(false);
        homeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBTN.setFocusPainted(false);
        homeBTN.addActionListener(this::homeBTNActionPerformed);
        jPanel3.add(homeBTN);

        addStudentBTN.setBackground(new java.awt.Color(153, 153, 255));
        addStudentBTN.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        addStudentBTN.setForeground(new java.awt.Color(100, 100, 100));
        addStudentBTN.setText("Add Student");
        addStudentBTN.setBorderPainted(false);
        addStudentBTN.setContentAreaFilled(false);
        addStudentBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentBTN.setFocusPainted(false);
        addStudentBTN.addActionListener(this::addStudentBTNActionPerformed);
        jPanel3.add(addStudentBTN);

        updateStudentBTN.setBackground(new java.awt.Color(153, 153, 255));
        updateStudentBTN.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        updateStudentBTN.setForeground(new java.awt.Color(100, 100, 100));
        updateStudentBTN.setText("Update Student");
        updateStudentBTN.setBorderPainted(false);
        updateStudentBTN.setContentAreaFilled(false);
        updateStudentBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateStudentBTN.setFocusPainted(false);
        updateStudentBTN.addActionListener(this::updateStudentBTNActionPerformed);
        jPanel3.add(updateStudentBTN);

        delStudentBTN.setBackground(new java.awt.Color(153, 153, 255));
        delStudentBTN.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        delStudentBTN.setForeground(new java.awt.Color(100, 100, 100));
        delStudentBTN.setText("Delete Student");
        delStudentBTN.setBorderPainted(false);
        delStudentBTN.setContentAreaFilled(false);
        delStudentBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delStudentBTN.setFocusPainted(false);
        delStudentBTN.addActionListener(this::delStudentBTNActionPerformed);
        jPanel3.add(delStudentBTN);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(240, 244, 249));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true), javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 350));
        jPanel4.setLayout(new java.awt.CardLayout());

        welcomeCard.setBackground(new java.awt.Color(255, 255, 255));
        welcomeCard.setMinimumSize(new java.awt.Dimension(500, 350));
        welcomeCard.setPreferredSize(new java.awt.Dimension(500, 350));
        welcomeCard.setLayout(new java.awt.GridBagLayout());

        showStudentListBTN.setBackground(new java.awt.Color(59, 130, 246));
        showStudentListBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showStudentListBTN.setForeground(new java.awt.Color(255, 255, 255));
        showStudentListBTN.setText("Student List");
        showStudentListBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showStudentListBTN.addActionListener(this::showStudentListBTNActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        welcomeCard.add(showStudentListBTN, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 65, 85));
        jLabel1.setText("Welcome!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        welcomeCard.add(jLabel1, gridBagConstraints);

        jPanel4.add(welcomeCard, "welcomeCard");

        addStudentCard.setBackground(new java.awt.Color(255, 255, 255));
        addStudentCard.setMinimumSize(new java.awt.Dimension(500, 350));
        addStudentCard.setPreferredSize(new java.awt.Dimension(500, 350));
        addStudentCard.setLayout(new java.awt.GridBagLayout());

        addNewStudentLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        addNewStudentLabel.setForeground(new java.awt.Color(31, 41, 55));
        addNewStudentLabel.setText("Add new Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        addStudentCard.add(addNewStudentLabel, gridBagConstraints);

        firstNameLabel.setForeground(new java.awt.Color(71, 85, 105));
        firstNameLabel.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(firstNameLabel, gridBagConstraints);

        firstNameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(15, 23, 42));
        firstNameField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(firstNameField, gridBagConstraints);

        lastNameLabel.setForeground(new java.awt.Color(71, 85, 105));
        lastNameLabel.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(lastNameLabel, gridBagConstraints);

        lastNameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(15, 23, 42));
        lastNameField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(lastNameField, gridBagConstraints);

        ageLabel.setForeground(new java.awt.Color(71, 85, 105));
        ageLabel.setText("Age:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(ageLabel, gridBagConstraints);

        ageField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ageField.setForeground(new java.awt.Color(15, 23, 42));
        ageField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(ageField, gridBagConstraints);

        emailLabel.setForeground(new java.awt.Color(71, 85, 105));
        emailLabel.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(emailLabel, gridBagConstraints);

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        emailField.setForeground(new java.awt.Color(15, 23, 42));
        emailField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        addStudentCard.add(emailField, gridBagConstraints);

        submitBtn.setBackground(new java.awt.Color(59, 130, 246));
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBtn.addActionListener(this::submitBtnActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        addStudentCard.add(submitBtn, gridBagConstraints);

        jPanel4.add(addStudentCard, "addStudentCard");

        tableCard.setBackground(new java.awt.Color(255, 255, 255));
        tableCard.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Age", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setFocusable(false);
        studentTable.setRowHeight(35);
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
            studentTable.getColumnModel().getColumn(2).setResizable(false);
            studentTable.getColumnModel().getColumn(3).setResizable(false);
            studentTable.getColumnModel().getColumn(4).setResizable(false);
        }

        tableCard.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(tableCard, "tableCard");

        updateStudentCard.setBackground(new java.awt.Color(255, 255, 255));
        updateStudentCard.setMinimumSize(new java.awt.Dimension(500, 350));
        updateStudentCard.setPreferredSize(new java.awt.Dimension(500, 350));
        updateStudentCard.setLayout(new java.awt.GridBagLayout());

        updateStudentLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        updateStudentLabel.setForeground(new java.awt.Color(31, 41, 55));
        updateStudentLabel.setText("Update Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        updateStudentCard.add(updateStudentLabel, gridBagConstraints);

        idLabel.setForeground(new java.awt.Color(71, 85, 105));
        idLabel.setText("Student ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(idLabel, gridBagConstraints);

        idField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        idField.setForeground(new java.awt.Color(15, 23, 42));
        idField.setMinimumSize(new java.awt.Dimension(250, 35));
        idField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(idField, gridBagConstraints);

        firstName1Label.setForeground(new java.awt.Color(71, 85, 105));
        firstName1Label.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(firstName1Label, gridBagConstraints);

        firstName1Field.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        firstName1Field.setForeground(new java.awt.Color(15, 23, 42));
        firstName1Field.setMinimumSize(new java.awt.Dimension(250, 35));
        firstName1Field.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(firstName1Field, gridBagConstraints);

        lastName1Label.setForeground(new java.awt.Color(71, 85, 105));
        lastName1Label.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(lastName1Label, gridBagConstraints);

        lastName1Field.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lastName1Field.setForeground(new java.awt.Color(15, 23, 42));
        lastName1Field.setMinimumSize(new java.awt.Dimension(250, 35));
        lastName1Field.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(lastName1Field, gridBagConstraints);

        age1Label.setForeground(new java.awt.Color(71, 85, 105));
        age1Label.setText("Age:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(age1Label, gridBagConstraints);

        age1Field.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        age1Field.setForeground(new java.awt.Color(15, 23, 42));
        age1Field.setMinimumSize(new java.awt.Dimension(250, 35));
        age1Field.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(age1Field, gridBagConstraints);

        email1Label.setForeground(new java.awt.Color(71, 85, 105));
        email1Label.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(email1Label, gridBagConstraints);

        email1Field.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        email1Field.setForeground(new java.awt.Color(15, 23, 42));
        email1Field.setMinimumSize(new java.awt.Dimension(250, 35));
        email1Field.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        updateStudentCard.add(email1Field, gridBagConstraints);

        updateBtn.setBackground(new java.awt.Color(16, 185, 129));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(this::updateBtnActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        updateStudentCard.add(updateBtn, gridBagConstraints);

        jPanel4.add(updateStudentCard, "updateStudentCard");

        deleteStudentCard.setBackground(new java.awt.Color(255, 255, 255));
        deleteStudentCard.setMinimumSize(new java.awt.Dimension(500, 350));
        deleteStudentCard.setPreferredSize(new java.awt.Dimension(500, 350));
        deleteStudentCard.setLayout(new java.awt.GridBagLayout());

        deleteStudentLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deleteStudentLabel.setForeground(new java.awt.Color(31, 41, 55));
        deleteStudentLabel.setText("Delete Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        deleteStudentCard.add(deleteStudentLabel, gridBagConstraints);

        warningLabel.setText("Enter the ID number of the student you wish to remove.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 80, 0);
        deleteStudentCard.add(warningLabel, gridBagConstraints);

        IdDeleteLabel.setText("Student ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        deleteStudentCard.add(IdDeleteLabel, gridBagConstraints);

        IdDeleteField.setMinimumSize(new java.awt.Dimension(250, 35));
        IdDeleteField.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        deleteStudentCard.add(IdDeleteField, gridBagConstraints);

        deleteBtn.setBackground(new java.awt.Color(239, 68, 68));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(this::deleteBtnActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(80, 0, 0, 0);
        deleteStudentCard.add(deleteBtn, gridBagConstraints);

        jPanel4.add(deleteStudentCard, "deleteStudentCard");

        jPanel2.add(jPanel4, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delStudentBTNActionPerformed
    resizePanel(500, 350);
    CardLayout layout = (CardLayout) jPanel4.getLayout();
    layout.show(jPanel4, "deleteStudentCard");
    }//GEN-LAST:event_delStudentBTNActionPerformed

    private void updateStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBTNActionPerformed
    resizePanel(500, 350);
    CardLayout layout = (CardLayout) jPanel4.getLayout();
    layout.show(jPanel4, "updateStudentCard");        
    }//GEN-LAST:event_updateStudentBTNActionPerformed

    private void addStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBTNActionPerformed
    resizePanel(500, 350);
    CardLayout layout = (CardLayout) jPanel4.getLayout();
    layout.show(jPanel4, "addStudentCard");
        
    }//GEN-LAST:event_addStudentBTNActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        resizePanel(500, 350);
        CardLayout layout = (CardLayout) jPanel4.getLayout();
        layout.show(jPanel4, "welcomeCard");
    }//GEN-LAST:event_homeBTNActionPerformed

    private void showStudentListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStudentListBTNActionPerformed
    refreshTable();
        resizePanel(950, 500);
    
    CardLayout cl = (CardLayout) jPanel4.getLayout();
    cl.show(jPanel4, "tableCard");
    }//GEN-LAST:event_showStudentListBTNActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
    
    String fName = firstNameField.getText();
    String lName = lastNameField.getText();
    String ageStr = ageField.getText();
    String email = emailField.getText();
    
    if (fName.isEmpty() || lName.isEmpty() || ageStr.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields!");
        return; 
    }
    
    int age;
    try {
        age = Integer.parseInt(ageStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Age must be a valid number!");
        return;
    }
    
    Student newStudent = new Student(0,fName,lName,age,email);
    StudentDAO dao = new StudentDAO();
    dao.addStudent(newStudent);
    
    
        // Show a success popup
        JOptionPane.showMessageDialog(this, "Student added successfully!");
        
        // 6. Clear the form so it's ready for the next student
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        emailField.setText("");
    
    }//GEN-LAST:event_submitBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    
        String idText = IdDeleteField.getText();
        
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student ID.");
        }
        
        try {
            int studentId = Integer.parseInt(idText);
            int confirm = JOptionPane.showConfirmDialog(this, "Delete ID: " + studentId + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            StudentDAO dao = new StudentDAO();
            dao.deleteStudent(studentId); 
            idField.setText(""); 
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
    
        int id = Integer.parseInt(idField.getText());
        String fName = firstName1Field.getText();
        String lName = lastName1Field.getText();
        int age = Integer.parseInt(age1Field.getText());
        String email = email1Field.getText();
        
        Student updatedStudent = new Student ( id, fName, lName, age, email);
        
        try {
           
        int confirm = JOptionPane.showConfirmDialog(this, "Update student with ID Number: " + updatedStudent.getStudentID(), "Confirm", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            StudentDAO dao = new StudentDAO();
            dao.updateStudent(updatedStudent);
            
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        idField.setText("");
        firstName1Field.setText("");
        lastName1Field.setText("");
        age1Field.setText("");
        email1Field.setText("");
        
    }//GEN-LAST:event_updateBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdDeleteField;
    private javax.swing.JLabel IdDeleteLabel;
    private javax.swing.JLabel addNewStudentLabel;
    private javax.swing.JButton addStudentBTN;
    private javax.swing.JPanel addStudentCard;
    private javax.swing.JTextField age1Field;
    private javax.swing.JLabel age1Label;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton delStudentBTN;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel deleteStudentCard;
    private javax.swing.JLabel deleteStudentLabel;
    private javax.swing.JTextField email1Field;
    private javax.swing.JLabel email1Label;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField firstName1Field;
    private javax.swing.JLabel firstName1Label;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton homeBTN;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName1Field;
    private javax.swing.JLabel lastName1Label;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton showStudentListBTN;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton submitBtn;
    private javax.swing.JPanel tableCard;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateStudentBTN;
    private javax.swing.JPanel updateStudentCard;
    private javax.swing.JLabel updateStudentLabel;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JPanel welcomeCard;
    // End of variables declaration//GEN-END:variables
}
