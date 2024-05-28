/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasktwofinal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Genius Muzama
 */
public class Login {
    // Static variables to store registered username and password
    private static String registeredUsername;
    private static String registeredPassword;
    private static String registeredName;
    private static String registeredSurname;
    
    // Method to set registered user information
    public static void setRegisteredUser(String username, String password, String name, String surname) {
        registeredUsername = username;
        registeredPassword = password;
        registeredName = name;
        registeredSurname = surname;
    }
    
    public static void register(){
        //Variables
        boolean checkUsername = false;
        boolean checkPasswordComplexity = false;
        String username, password, name, surname;
        boolean loginUser = false;
        
        //registration
        // Name check
        do {
            name = JOptionPane.showInputDialog(null, "Enter your name:");
            if (name == null || name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name cannot be empty. Please enter a valid name.");
            }
        } while (name == null || name.trim().isEmpty());

        // Surname check
        do {
            surname = JOptionPane.showInputDialog(null, "Enter your surname:");
            if (surname == null || surname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Surname cannot be empty. Please enter a valid surname.");
            }
        } while (surname == null || surname.trim().isEmpty());

        //Username check
        do {
            username = JOptionPane.showInputDialog(null, """ 
                Enter Username:
                Username must contain an underscore
                and be no more than 5 characters in length
            """);

            if (username == null || username.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username cannot be empty. Please enter a valid username.");
            } else if (!(username.contains("_") && username.length() <= 5)) {
                JOptionPane.showMessageDialog(null, """
                    Username is not correctly formatted, 
                    please ensure that your username contains an underscore and is no more than 5 characters in length
                """);
                username = null; // Reset username to null to continue the loop
            }
        } while (username == null || username.trim().isEmpty());

        JOptionPane.showMessageDialog(null, "Username saved");        
        // Password check
        do {
            password = JOptionPane.showInputDialog(null, """ 
                    Enter Password:
                    Password must contain 
                    1 upper case 
                    1 number 
                    1 special character [@$#!] 
                    and be min 8 chars in length""");
            
            if (password == null || password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password cannot be empty. Please enter a valid password.");
                continue;
            }
            
            Pattern specialPattern = Pattern.compile("[^A-Za-z0-9]");
            Pattern digitPattern = Pattern.compile("\\d");
            Pattern capsPattern = Pattern.compile("[A-Z]");
            Matcher specialMatcher = specialPattern.matcher(password);
            Matcher digitMatcher = digitPattern.matcher(password);
            Matcher capsMatcher = capsPattern.matcher(password);
            
            checkPasswordComplexity = password.length() >= 8
                    && specialMatcher.find()
                    && digitMatcher.find()
                    && capsMatcher.find();
            
            if (!checkPasswordComplexity) {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, "
                        + "a capital letter, a number, and a special character.");
            } else {
                JOptionPane.showMessageDialog(null, "Password successfully captured");
            }
        } while (!checkPasswordComplexity);

        
        registeredUsername = username; // Storing the registered username
        registeredPassword = password; // Storing the registered password
        registeredName = name; // Storing the registered name
        registeredSurname = surname; // Storing the registered name
        
        // After registration, pass the registered user information to the Login class
        Login l = new Login();
        Login.setRegisteredUser(registeredUsername, registeredPassword, registeredName, registeredSurname);

        JOptionPane.showMessageDialog(null, "Registration Successful!!!!");
        
        while(true)
        {
            String userInput = JOptionPane.showInputDialog(null, """
                                                                 Enter (1): Login
                                                                 Enter (2): Exit""");
            
        int choice;
            try {
                choice = Integer.parseInt(userInput);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, """
                                                Invalid Entry 
                                                Choose between 1-3""");
            continue;
            }
            //Processing of the choice
            switch(choice)
            {
                case 1: l.login(); break;
                //case 2: TaskTwoFinal.main(); break;
                case 2: System.exit(0); break;
                default: JOptionPane.showMessageDialog(null, """
                                                             Invalid Entry 
                                                             Choose between 1 or 2"""); break;
            }//switch ends
        }//while ends
    }//register method ends here
    
    public static void login()
    {
        String userNameCheck;
        String passwordCheck;
        boolean loginUser = false;
        int attempts = 3;
        
        while (attempts != 0){
            userNameCheck = JOptionPane.showInputDialog("Enter username:");
            passwordCheck = JOptionPane.showInputDialog("Enter your password:");
            
            // Check if username and password are not empty
            if (userNameCheck == null || userNameCheck.trim().isEmpty() || 
                passwordCheck == null || passwordCheck.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username and password cannot be empty.");
                continue; // Restart the loop if empty values are entered
            }
                    
            // Attempt to login
            loginUser = userNameCheck.equals(registeredUsername) && passwordCheck.equals(registeredPassword);

            if (!loginUser) {
                attempts--;
                JOptionPane.showMessageDialog(null, "Invalid Username or Password.\nYou have " + attempts + " attempts left.");
            } else {
                // If login successful, proceed to menu choice
                JOptionPane.showMessageDialog(null, "Login successful\nWelcome " + registeredName + " " + registeredSurname + ", it is great to see you again.");
                TaskTwoFinal t = new TaskTwoFinal();
                t.userMenu();
                return; // Exit the method after successful login
            }
        }//while loop ends here
        
        //if max attempts are reached
        if (attempts == 0) {
            JOptionPane.showMessageDialog(null, """
                                                Your account is locked.
                                                Contact admin: ST10027393@vcconnect.edu.za
                                                Bye Bye""");
            System.exit(0);
        }
    }//login method
}
