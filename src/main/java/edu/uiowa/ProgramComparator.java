/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa;

import java.util.Comparator;

/**
 *
 * @author Hiep
 */
public class ProgramComparator implements Comparator<Program>{

    @Override
    public int compare(Program o1, Program o2) {
        String p1_1 = ParserUtil.getFirstSessionOfCode(o1.getCode());
        String p1_2 = ParserUtil.getSecondSessionOfCode(o1.getCode());
        
        String p2_1 = ParserUtil.getFirstSessionOfCode(o2.getCode());
        String p2_2 = ParserUtil.getSecondSessionOfCode(o2.getCode());
        
        int r = p1_1.compareTo(p2_1);
        
        return r!=0?r: p1_2.compareTo(p2_2);
    }
    
}
