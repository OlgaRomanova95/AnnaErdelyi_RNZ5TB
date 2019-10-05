/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author Erdélyi Anna
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation numb1 = new QuadraticEquation(3, 4, 0);
        QuadraticEquation numb2 = new QuadraticEquation(-4, 5, 6);
        QuadraticEquation numb3 = new QuadraticEquation(5, 5, 5);
        
        printRoot(numb1);
        printRoot(numb2);
        printRoot(numb3);
        
        LinearEquation nb1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation nb2 = new LinearEquation(2, 3, 4, 5, 6, 7);
        LinearEquation nb3 = new LinearEquation(1, 0, 0, 0, 0, 0);
        
        printSolution(nb1);
        printSolution(nb2);
        printSolution(nb3);
        
    }
    
    public static void printRoot(QuadraticEquation qe){
        if (qe.getDiscriminant() > 0){
            System.out.println(qe.getRoot1() + ", " + qe.getRoot2());
        }
        else if (qe.getDiscriminant() == 0){
            System.out.println(qe.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
    
    public static void printSolution(LinearEquation le){
        if (le.isSolvable()){
            System.out.println(le.getX() + ", " + le.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
    }
    
}
