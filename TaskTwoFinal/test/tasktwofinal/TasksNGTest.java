/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tasktwofinal;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Genius Muzama
 */
public class TasksNGTest {
    
    public TasksNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of isCheckTaskDescription method, of class Tasks.
     */
    @Test

    public void testIsCheckTaskDescription() {
        System.out.println("isCheckTaskDescription");
        String taskName = "";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.isCheckTaskDescription(taskName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckTaskDescription method, of class Tasks.
     */
    @Test
    public void testSetCheckTaskDescription() {
        System.out.println("setCheckTaskDescription");
        boolean checkTaskDescription = false;
        Tasks instance = new Tasks();
        instance.setCheckTaskDescription(checkTaskDescription);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCreateTaskID method, of class Tasks.
     */
    @Test
    public void testGetCreateTaskID() {
        System.out.println("getCreateTaskID");
        String taskName = "";
        int taskNumber = 0;
        String taskDev = "";
        String taskID = "";
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.getCreateTaskID(taskName, taskNumber, taskDev, taskID);
        assertEquals(result, expResult);

    }

    /**
     * Test of setCreateTaskID method, of class Tasks.
     */
    @Test
    public void testSetCreateTaskID() {
        System.out.println("setCreateTaskID");
        String createTaskID = "";
        Tasks instance = new Tasks();
        instance.setCreateTaskID(createTaskID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrintTaskDetails method, of class Tasks.
     */
    @Test
    public void testGetPrintTaskDetails() {
        System.out.println("getPrintTaskDetails");
        String taskStatus = "";
        String taskDevDetails = "";
        int taskNumber = 0;
        String taskName = "";
        String taskDesc = "";
        String taskID = "";
        int taskDuration = 0;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.getPrintTaskDetails(taskStatus, taskDevDetails, taskNumber, taskName, taskDesc, taskID, taskDuration);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrintTaskDetails method, of class Tasks.
     */
    @Test
    public void testSetPrintTaskDetails() {
        System.out.println("setPrintTaskDetails");
        String printTaskDetails = "";
        Tasks instance = new Tasks();
        instance.setPrintTaskDetails(printTaskDetails);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnTotalHours method, of class Tasks.
     */
    @Test
    public void testGetReturnTotalHours() {
        System.out.println("getReturnTotalHours");
        int taskDuration = 0;
        int totalHours = 0;
        Tasks instance = new Tasks();
        int expResult = 0;
        int result = instance.getReturnTotalHours(taskDuration, totalHours);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnTotalHours method, of class Tasks.
     */
    @Test
    public void testSetReturnTotalHours() {
        System.out.println("setReturnTotalHours");
        int returnTotalHours = 0;
        Tasks instance = new Tasks();
        instance.setReturnTotalHours(returnTotalHours);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
