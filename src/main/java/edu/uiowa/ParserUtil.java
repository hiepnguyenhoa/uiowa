/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa;

import edu.uiowa.exception.InvalidCodeFormatException;

/**
 *
 * @author Hiep
 */
public class ParserUtil {
//    static final String FORMAT_CODE= "^[a-zA-Z]\\d+";
    
    public static String getFirstSessionOfCode(String code) throws InvalidCodeFormatException{
        checkFormat(code);
        return code.substring(0,1);
    }
    
    public static String getSecondSessionOfCode(String code)throws InvalidCodeFormatException{
        checkFormat(code);
        return code.substring(1, code.length());
    }
    
    private static void checkFormat(String code)throws InvalidCodeFormatException{
        if(code==null||code.length()<1) throw new InvalidCodeFormatException(code);
    }
    
    
}
