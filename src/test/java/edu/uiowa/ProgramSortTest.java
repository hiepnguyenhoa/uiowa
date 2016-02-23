/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa;

import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiep
 */
public class ProgramSortTest {

    private ProgramSort programs;

    public ProgramSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        programs = new ProgramSort();
        programs.addProgram(new Program("T1", "The first transfer orientation program"));
        programs.addProgram(new Program("T9", "The last transfer orientation program"));
        programs.addProgram(new Program("F1", "The first freshmen orientation program"));
        programs.addProgram(new Program("F17", "The last freshmen orientation program"));
        programs.addProgram(new Program("I1", "The only international orientation program"));
        programs.addProgram(new Program("F12", "Another transfer orientation program"));
        programs.addProgram(new Program("A9", "OOP"));
        programs.addProgram(new Program("A3", "OOP introduction"));

    }

    @After
    public void tearDown() {
    }

    @Test
    public void sortByComparable() {
        System.out.println("-- Begin Sort By Comparable");
        printData(programs);
        programs.sort();
        System.out.println("-- Result Sort By Comparable");
        printData(programs);
        System.out.println("-- End Sort By Comparable");
//        for(Program program:programs.getPrograms()){
//            if(progr)
//        }
    }

    @Test
    public void sortByComparator() {
        System.out.println("++ Begin Sort By Comparator");
        printData(programs);
        Collections.sort(programs.getPrograms(), new ProgramComparator());
        System.out.println("++ Result Sort By Comparator");
        printData(programs);
        System.out.println("++ End Sort By Comparator");
    }

    private void printData(ProgramSort programs) {
        for (Program program : programs.getPrograms()) {
            System.out.println(program.toString());
        }
    }

}
