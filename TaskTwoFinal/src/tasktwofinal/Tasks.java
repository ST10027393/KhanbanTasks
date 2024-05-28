/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasktwofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Genius Muzama
 */
public class Tasks {

    //variables
    boolean checkTaskDescription;
    String createTaskID;
    String printTaskDetails;
    int returnTotalHours;
    
    //method -- length of desc MAX 50 chars; method must be boolean
    public boolean isCheckTaskDescription(String taskName) 
    {
        if (taskName.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task Successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
        }//if ends here
        return checkTaskDescription = true;
    }//end of method
    
    public void setCheckTaskDescription(boolean checkTaskDescription) {
        this.checkTaskDescription = checkTaskDescription;
    }
    
    //task ID
    public String getCreateTaskID(String taskName, int taskNumber, String taskDev, String taskID) 
    {
        taskID = taskName.substring(0,2).toUpperCase()+ 
                ":" +taskNumber+ ":"
                +taskDev.substring(taskDev.length()-3).toUpperCase();
        return taskID;
    }
    
    public void setCreateTaskID(String createTaskID) {
        this.createTaskID = createTaskID;
    }
    
    //print details method
    public String getPrintTaskDetails(String taskStatus, String taskDevDetails, int taskNumber,String taskName, String taskDesc, String taskID, int taskDuration)
    {
        JOptionPane.showMessageDialog(null, "Task details of task : " 
        + "\nTask Status: " + taskStatus
        + "\nDeveloper Details: " + taskDevDetails
        + "\nTask Number: " + taskNumber
        + "\nTask Name: " + taskName
        + "\nTask Description: " + taskDesc
        + "\nTask ID: " + taskID
        + "\nTask Duration: " + taskDuration + " hours"); 
        
        return printTaskDetails;
    }//details method ends here
    
    public void setPrintTaskDetails(String printTaskDetails) 
    {
        this.printTaskDetails = printTaskDetails;
    }
    
    //method for hours
    public int getReturnTotalHours(int taskDuration, int totalHours)
    {
        totalHours = totalHours + taskDuration;
        return totalHours;
    }//hours method ends
    
    public void setReturnTotalHours(int returnTotalHours) 
    {
        this.returnTotalHours = returnTotalHours;
    }
    
    
}//class ends here
