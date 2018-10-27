/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author ENG Maha
 */
public enum Status {
    active(100), deleted(200);
    private int numVal;

    private Status(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    public void setNumVal(int numVal) {
        this.numVal = numVal;
    }
    
    
}
