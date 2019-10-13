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
public class VendeglatoipariETest {

    public static Kocsma[] adottItaltKinaloKocsmak(VendeglatoipariE[] vendeglato, String ital) {
        int k = 0;
        for (int j = 0; j < vendeglato.length; j++) { //összeszedem, hogy hány kocsmában van a keresett ital
            if (vendeglato[j] instanceof Kocsma) { //megnézzük, hogy egyáltalán kocsma-e az adott vlie
                Kocsma adottKocsma = (Kocsma) vendeglato[j]; //típuskényszerítés

                for (int i = 0; i < adottKocsma.getSorlap().length; i++) {
                    if (adottKocsma.getSorlap()[i].equals(ital)) {
                        k++;
                    }
                }
            }
        }
        Kocsma[] kocsmak = new Kocsma[k]; //létrehozom a tömböt, aminek így már előre tudom a méretét, mivel az előző forban már összeszámoltam
        k = 0;
        for (int j = 0; j < vendeglato.length; j++) {
            if (vendeglato[j] instanceof Kocsma) {
                Kocsma adottKocsma = (Kocsma) vendeglato[j];

                for (int l = 0; l < adottKocsma.getSorlap().length; l++) {
                    if (adottKocsma.getSorlap()[l].equals(ital)) {
                        kocsmak[k++] = adottKocsma; // hozzáadom a tömbhöz az adottKocsmát
                        //k++;
                    }
                }
            }
        }
        return kocsmak;
    }

    public static void main(String[] args) {
        VendeglatoipariE[] vlie = new VendeglatoipariE[]{ //vlie = vendeglatoipati egyseg
            new Etterem(new String[]{"leves1", "foetel1", "desszert1"}, "Etterem1", 22),
            new Etterem(new String[]{"leves2", "foetel1", "desszert2"}, "Etterem2", 132),
            new Etterem(new String[]{"leves1", "foetel3", "desszert1"}, "Etterem3", 48),
            new Etterem(new String[]{"leves4", "foetel1", "desszert4"}, "Etterem4", 15),
            new Etterem(new String[]{"leves5", "foetel5", "desszert5"}, "Etterem5", 8),
            new Kocsma(new String[]{"cola", "sor", "bor"}, "Kocsma1", 34),
            new Kocsma(new String[]{"udito", "sor", "kave"}, "Kocsma2", 63),
            new Kocsma(new String[]{"sprite", "sor", "bor"}, "Kocsma3", 42),
            new Kocsma(new String[]{"cola", "palinka", "bor"}, "Kocsma4", 27),
            new Kocsma(new String[]{"fanta", "sor", "kave"}, "Kocsma5", 49),};
        System.out.println(Arrays.toString(adottItaltKinaloKocsmak(vlie, "cola")));
    }
}
