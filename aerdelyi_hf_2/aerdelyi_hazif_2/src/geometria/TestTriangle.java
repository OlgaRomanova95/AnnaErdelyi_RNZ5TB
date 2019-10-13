package geometria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erdélyi Anna
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColour("yellow");
        triangle.setFilled(true);
        System.out.println("Triangle area: " + triangle.getArea() + ", perimeter: " + triangle.getPerimeter() + ", colour: " + triangle.getColour() + ", filled: " + triangle.getFilled() + '.');
    }
    
}
