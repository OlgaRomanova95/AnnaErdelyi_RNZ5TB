/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpkupaturak;

/**
 *
 * @author Erdélyi Anna
 */
public class Turak implements Comparable<Turak>{
    private String tura;
    private int ev;
    private int honap;
    private int nap;
    private int tav;

    public Turak(String tura, int ev, int honap, int nap, int tav) {
        this.tura = tura;
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.tav = tav;
    }

    @Override
    public String toString() {
        return ev + ";" + honap + ";" + nap + ";" + tura;
    }

    @Override
    public int compareTo(Turak o) {
        if (this.tav != o.tav){
            return this.tav - o.tav;
        }
        if (this.ev != o.ev){
            return o.ev - this.ev;
        }
        if (this.honap != o.honap){
            return o.honap - this.honap;
        }
        if (this.nap != o.nap){
            return o.nap - this.nap;
        }
        return this.tura.compareTo(o.tura); // tovább adja a kérdést a String compareTo-jához, ami automatikusan ábécé sorrendbe rakja a kérést
    }

    public int getTav() {
        return tav;
    }
    
    
}
