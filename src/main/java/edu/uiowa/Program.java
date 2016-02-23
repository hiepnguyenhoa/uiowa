/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa;

import java.util.Objects;

/**
 *
 * @author Hiep
 */
public class Program implements Comparable<Program> {
    
    // program code has format /^[a-zA-Z]\d+/
    private String code;
    private String name;

    public Program(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Program o) {
        String p1_1 = ParserUtil.getFirstSessionOfCode(this.getCode());
        String p1_2 = ParserUtil.getSecondSessionOfCode(this.getCode());
        
        String p2_1 = ParserUtil.getFirstSessionOfCode(o.getCode());
        String p2_2 = ParserUtil.getSecondSessionOfCode(o.getCode());
        
        int r = p1_1.compareTo(p2_1);
        
        return r!=0?r: p1_2.compareTo(p2_2);
        
    }    
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Program)){
            return false;
        }
        Program prog = (Program) obj;
        return this.getCode().equalsIgnoreCase(prog.getCode());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.code);
        return hash;
    }
    
    @Override
    public String toString(){
        return String.format("Code: %s - Name:%s", this.getCode(), this.getName());
    }
    
}
