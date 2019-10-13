/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendeglatoiparie;

/**
 *
 * @author Erdélyi Anna
 */
public class Etterem extends VendeglatoipariE {

    private String[] etlap;

    public Etterem(String[] etlap, String nev, int ferohelyekSzama) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem {" + "etlap = " + etlap + '}';
    }

}
