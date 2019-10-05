/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pont;

/**
 *
 * @author Erdélyi Anna
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pont pont1 = new Pont(2, 3);
        Pont pont2 = new Pont(4, 5);
        Pont pont3 = new Pont(7, 9);
        Pont pont4 = new Pont(8, 8);
        
        pont1.setY(pont1.getY() + 5);
        pont2.setY(pont2.getY() + 5);
        pont3.setX(pont3.getX() - 3.4);
        pont4.setX(pont4.getX() - 3.4);
        
        System.out.println(pont1.getY());
        System.out.println(pont2.getY());
        System.out.println(pont3.getX());
        System.out.println(pont4.getX());
        
    }
    
}
