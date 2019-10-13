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
public class VendeglatoipariE {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoipariE(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "VendeglatoipariE {" + "nev=" + nev + ", ferohelyekSzama = " + ferohelyekSzama + ", dohanyzo = " + dohanyzo + '}';
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }
    
    
}
