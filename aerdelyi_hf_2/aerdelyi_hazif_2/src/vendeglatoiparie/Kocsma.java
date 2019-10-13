/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendeglatoiparie;

import java.util.Arrays;

/**
 *
 * @author Erdélyi Anna
 */
public class Kocsma extends VendeglatoipariE {

    private String[] sorlap;

    public Kocsma(String[] sorlap, String nev, int ferohelyekSzama) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma {" + "sorlap = " + Arrays.toString(sorlap) + '}';
    }
    
}
