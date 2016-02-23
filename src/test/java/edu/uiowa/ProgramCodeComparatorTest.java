/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiep
 */
public class ProgramCodeComparatorTest {
    
    @Test
    public void testSortByCode1(){
        String[] codes = new String[] { "A1", "F1", "F12", "F7", "A9", "A3"};
        printData(codes);
        Arrays.sort(codes, new ProgramCodeComparator());
        printData(codes);
    }
    
    @Test
    public void testSortByCode2(){
        String[] codes = new String[] {};
        printData(codes);
        Arrays.sort(codes, new ProgramCodeComparator());
        printData(codes);
    }
    
    private void printData(String[] codes){
        for(int i=0; i<codes.length; i++) System.out.print(String.format("%s ", codes[i]));
        System.out.println();
    }
}
