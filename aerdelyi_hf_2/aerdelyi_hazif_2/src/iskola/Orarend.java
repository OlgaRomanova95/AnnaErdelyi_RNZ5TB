/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Arrays;

/**
 *
 * @author Erdélyi Anna
 */
public class Orarend {

    private String nap;
    private Ora[] orak; //az órákat tartalmazza
    private int orakSzama; //számláló

    public Orarend(String nap) {
        this.nap = nap;
        this.orakSzama = 0;
        this.orak = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOrak() {
        return orak;
    }

    public void setOrak(Ora[] orak) {
        this.orak = orak;
    }

    public int getOrakSzama() {
        return orakSzama;
    }

    public void setOrakSzama(int orakSzama) {
        this.orakSzama = orakSzama;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", orak=" + Arrays.toString(orak) + ", orakSzama=" + orakSzama + '}';
    }

    public boolean oratHozzaad(Ora tantargy) { //Ora osztály
        if (orakSzama < 12) {
            for (int i = 0; i < orakSzama; i++) {
                if(orak[i].getKezdet() == tantargy.getKezdet()){
                    return false;
                }
            }
            orak[orakSzama] = tantargy;
            orakSzama += 1;
        } else {
            return false;
        }
        return true;
    }

}
