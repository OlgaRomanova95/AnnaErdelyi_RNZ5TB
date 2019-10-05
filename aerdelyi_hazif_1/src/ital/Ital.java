/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Date;

/**
 *
 * @author Erdélyi Anna
 */
public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDatum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + ", " + ar + " Ft";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ital)){ // bal oldal: pld.,jobb: osztály >> a pld. nem tagja a jobb oldali osztálynak
            return false;
        }
        
        Ital ital1 = this;
        Ital ital2 = (Ital)obj;
        
        if (ital1.nev.equals(ital2.nev) && ital1.kiszereles.equals(ital2.kiszereles)/*ar mindig egyenlo, mert static*/){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static double getArEuroban(){
        return ar / 332.7; //2019.10.05.-i árfolyam
    }
    
    
    
}
