/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

import java.util.ArrayList;

/**
 *
 * @author ENG Maha
 */
public class MyFirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     Circle c=new Circle(10);
     c.setPoint(new Point(5,5));
     System.out.println(c.getPointAsString());
    }
    
}
  
         
