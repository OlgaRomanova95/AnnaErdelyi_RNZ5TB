/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author Erdélyi Anna
 */
public class Test {
    
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("Perimeter: " + polygon1.getPerimeter() + ", Area: " + polygon1.getArea());
        System.out.println("Perimeter: " + polygon2.getPerimeter() + ", Area: " + polygon2.getArea());
        System.out.println("Perimeter: " + polygon3.getPerimeter() + ", Area: " + polygon3.getArea());
        
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        
        System.out.println(rectangle1.width + ", " + rectangle1.height + ", " + rectangle1.getArea() + ", " + rectangle1.getPerimeter());
        System.out.println(rectangle2.width + ", " + rectangle2.height + ", " + rectangle2.getArea() + ", " + rectangle2.getPerimeter());
    }
    
}
