/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasktwofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Genius Muzama
 */
public class TaskTwoFinal {
    // Static variables to store registered username and password
    private static String registeredUsername;
    private static String registeredPassword;
    private static String registeredName;
    private static String registeredSurname;

    //variables
    public static int arraySize;
    public static void main(String[] args) {
        
        houseKeeping();
        boolean exitProgram = false;

        while (!exitProgram) {
            mainMenu();
            if (!exitProgram) {
                userMenu();
            }
        }       
        
    }//main ends here
    
     public static void houseKeeping() {
        
        JOptionPane.showMessageDialog(null,"Welcome to the Kanban Board");        
        JOptionPane.showMessageDialog(null,"Login or Register to continue");
    }//housekepping ends here
    
    public static boolean mainMenu() {
        boolean closeProg = false;

        while (!closeProg) {
            String userInput = JOptionPane.showInputDialog(null, """
                    --- Menu ---
                    1 -- Instruction
                    2 -- Login
                    3 -- Register
                    4 -- Exit
                    Enter your choice to begin >>>""");

            // Create object of class
            Login l = new Login();

            int choice;
            try {
                choice = Integer.parseInt(userInput);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, """
                        Invalid Entry 
                        Choose between 1-4""");
                continue;
            }

            // Processing of the choice
            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Feature unavailable please select a different number");
                    break;
                case 2:
                    if (registeredUsername == null || registeredPassword == null || registeredName == null || registeredSurname == null) {
                        JOptionPane.showMessageDialog(null, "You need to register an account first");
                    } else {
                        l.login();
                    }
                    break;
                case 3:
                    l.register();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Quitting the program. . .");
                    System.exit(0); break;
                default:
                    JOptionPane.showMessageDialog(null, """
                            Invalid Entry 
                            Choose between 1-4""");
                    break;
            }
        }
        return false;
    }//main method ends here
    
    public static void userMenu() {
        boolean closeProg = false;
        int menuChoice;

        while (!closeProg) {
            try {
                menuChoice = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Welcome to EasyKanban
                    Please choose an option
                    [1] - Add Tasks
                    [2] - Show Report
                    [3] - Quit Program"""));

                switch (menuChoice) {
                    case 1:
                        tasks();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Coming soon");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Quitting the program. . .");
                        System.exit(0); break;
                    default:
                        JOptionPane.showMessageDialog(null, "Enter a valid option");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
            }
        }
    }//user menu ends here
    
    public static void tasks(){
        arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of tasks"));
        
        //optional
        if(arraySize <= 0){
            JOptionPane.showInputDialog(null, "Please enter a valid number of tasks");
        }//if ends here
        
        String[] taskName = new String [arraySize];        
        String[]taskDesc = new String [arraySize];
        String[] taskDevDetails = new String [arraySize];
        String[] taskStatus = new String [arraySize];
        String[] taskID = new String [arraySize];
        int[] taskNumber = new int [arraySize];        
        int[] taskDuration = new int [arraySize];
        int taskStatusNumber;
        int totalHours = 0 ;
        
        //call class
        Tasks ts = new Tasks();
        for (int i = 0; i < arraySize; i++) {
            taskNumber[i] = (i + 1);

        // Get task name
                do {
                    taskName[i] = JOptionPane.showInputDialog(null, "Enter the name for task " + taskNumber[i]);
                    if (taskName[i] == null || taskName[i].trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Task name cannot be empty. Please enter a valid task name.");
                    }
                } while (taskName[i] == null || taskName[i].trim().isEmpty());

                // Get task description
                ts.checkTaskDescription = false;
                while (!ts.checkTaskDescription) {
                    taskDesc[i] = JOptionPane.showInputDialog(null, "Enter a description for task " + taskNumber[i] + " that is < 50 characters");
                    if (taskDesc[i] == null || taskDesc[i].trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Task description cannot be empty. Please enter a valid task description.");
                    } else {
                        ts.checkTaskDescription = ts.isCheckTaskDescription(taskDesc[i]);
                    }
                }

                // Get developer details
                do {
                    taskDevDetails[i] = JOptionPane.showInputDialog(null, "Enter developer name & surname");
                    if (taskDevDetails[i] == null || taskDevDetails[i].trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Developer details cannot be empty. Please enter valid developer details.");
                    }
                } while (taskDevDetails[i] == null || taskDevDetails[i].trim().isEmpty());

                // Get task duration
                taskDuration[i] = -1;
                while (taskDuration[i] < 0) {
                    try {
                        String durationInput = JOptionPane.showInputDialog(null, "Enter task duration in hours");
                        if (durationInput == null) {
                            JOptionPane.showMessageDialog(null, "Task duration cannot be empty. Please enter a valid task duration.");
                            continue;
                        }
                        taskDuration[i] = Integer.parseInt(durationInput);
                        if (taskDuration[i] < 0) {
                            JOptionPane.showMessageDialog(null, "Task duration must be a positive number.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number for task duration.");
                    }
                }
            
            //to do - done - doing
            taskStatusNumber = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            Choose an option for task status
                                                                            [1] - To do
                                                                            [2] - Done
                                                                            [3] - Doing"""));
            switch(taskStatusNumber){
                case 1: taskStatus[i] = "To do"; break;                
                case 2: taskStatus[i] = "Done"; break;
                case 3: taskStatus[i] = "Doing"; break;
                default: JOptionPane.showMessageDialog(null, "Invalid number selected");

            }//switch ends
            
            taskID[i] = ts.getCreateTaskID(taskName[i], taskNumber[i], taskDevDetails[i], taskID[i]);
            
            //total hours
            
            totalHours = ts.getReturnTotalHours(taskDuration[i], totalHours);
            System.out.println("added");
            System.out.println(ts.getPrintTaskDetails(taskStatus[i], taskDevDetails[i], taskNumber[i], taskName[i], taskDesc[i], taskID[i], taskDuration[i]));
        }//for ends here  
        if (arraySize > 0) {
                JOptionPane.showMessageDialog(null, "Total hours: "+ totalHours);
            }//if ends here
    }//method ends here
    
}

/*
References:
    Stack overflow global variables - https://stackoverflow.com/questions/9351955/how-to-use-a-variable-of-one-method-in-another-method#:~:text=You%20can't.,isn't%20always%20applicable).
    Farrell, J. 2019. Java Programming. 9th edition. 2019. Course technology, Cengage Learning
    Youtube - Unit test - https://www.youtube.com/watch?v=1Pa15vDWG-8&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=4
    Youtube - Automated Unit testing - https://www.youtube.com/watch?v=uNLcbz6RORQ&feature=youtu.be
    Youtube - PROG55121 Playlist - Loops - https://www.youtube.com/playlist?list=PL480DYS-b_kdeTtKbhxwhxHRrh-XRcyJH     
*/


