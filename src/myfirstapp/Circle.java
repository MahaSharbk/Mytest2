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
 class Circle {
   private  float radius ;
   private Point point;  

   public Circle (){}
    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, Point p) {
        this.radius = radius;
        this.point = p;
    }

   
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }
    public String getPointAsString(){
        return "("+this.point.getX()+","+this.point.getY()+")";
    }
    public void setPoint(Point p) {
        this.point = p;
    }
    //إعادة تحميل الطريقة setPoint
   
    public void setPoint(float x, float y){
        this.point.setX(x);
        this.point.setY(y);
    }
    
    //حساب مساحة الدائرة
     public double getArea(){
        double x=Math.pow(radius, 2) * Math.PI;
        return x;
    }
 
            
          
}
