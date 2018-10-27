/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ENG Maha
 */
public class MyFirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Eample: 12-25-2103");
      System.out.print("Enter date: ");
      String str = sc.nextLine();
  
      try {
         Date date = sdf.parse(str); 
 
         sdf = new SimpleDateFormat("EEE, dd MM yyyy");
         System.out.println(date);
         System.out.println("Date: " + sdf.format(date));
      } catch (ParseException e) { 
         System.out.println("Parse Exception");
      }
  
         
        int x=(int)Status.deleted.getNumVal();
        String xx=Status.deleted.toString();
        System.out.println(xx);
     Circle c=new Circle(10);
     c.setPoint(new Point(5,5));
     System.out.println(c.getPointAsString());
    }
    
}
  
         
