/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katona;

/**
 *
 * @author Erdélyi Anna
 */
public class Teszt {
    public static void main(String[] args) {
        Katona katona1 = new Katona(6,3);
        Nyilas katona2 = new Nyilas(5,3,4);
        Landzsas katona3 = new Landzsas(4,8);
        
        Katona gyoztes = megkuzd(katona1, katona2);
        System.out.println(megkuzd(gyoztes, katona3));
    }
    
    public static Katona megkuzd(Katona katona1, Katona katona2){
        int ertek1 = katona1.getTamadoero() - katona2.getVedoero();
        int ertek2 = katona2.getTamadoero() - katona1.getVedoero();
        if(ertek1 < ertek2){
            return katona2;
        }
        else {
            return katona1;
        }
    }
}
