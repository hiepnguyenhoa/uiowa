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
public class ProgramCodeComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String p1_1 = ParserUtil.getFirstSessionOfCode(o1);
        String p1_2 = ParserUtil.getSecondSessionOfCode(o1);

        String p2_1 = ParserUtil.getFirstSessionOfCode(o2);
        String p2_2 = ParserUtil.getSecondSessionOfCode(o2);

        int r = p1_1.compareTo(p2_1);

        return r != 0 ? r : p1_2.compareTo(p2_2);
    }

}
