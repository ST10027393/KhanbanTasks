/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tasktwofinal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Genius Muzama
 */
public class TasksTest {
    
    public TasksTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isCheckTaskDescription method, of class Tasks.
     */
    @Test
    public void testIsCheckTaskDescription() {
        System.out.println("isCheckTaskDescription");
        String taskName = "";
        Tasks instance = new Tasks();
        boolean expResult = false;
        boolean result = instance.isCheckTaskDescription(taskName);
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
