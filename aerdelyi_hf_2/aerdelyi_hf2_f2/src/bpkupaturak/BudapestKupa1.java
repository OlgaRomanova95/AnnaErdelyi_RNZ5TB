/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpkupaturak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Erdélyi Anna
 */
public class BudapestKupa1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sor = sc.nextInt(); //első sor, túrák száma
        sc.nextLine();
        System.out.println(sor);
        ArrayList<Turak> turaLista = new ArrayList<>();
        for (int i = 0; i < sor; i++) {
            String tura = sc.nextLine();
            String[] t = tura.split(";");
            System.out.println(Arrays.toString(t));
            int ev = Integer.parseInt(t[0]);
            int honap = Integer.parseInt(t[1]);
            int nap = Integer.parseInt(t[2]);
            String nev = t[3];
            
            int tav = 0;
            
            for (int j = 4; j < t.length; j++){
                tav += Integer.parseInt(t[j]);
            }
            Turak turak = new Turak(nev, ev, honap, nap, tav);
            turaLista.add(turak); //felfűzöm a túralistához a beolvasott sorokat
        }
        Collections.sort(turaLista); //rendezi magát
        int utolsoIndex = turaLista.size() - 1;
        Turak legnagyobbTura = turaLista.get(utolsoIndex);
        for (int i = utolsoIndex; i >= 0; i-- ){ //hátulról előre íratom ki a listát, mert az utolsó lesz majd az legnagyobb
            if(turaLista.get(i).getTav() != turaLista.get(utolsoIndex).getTav()){
                break;
            }
        	System.out.println(turaLista.get(i));
        }
    }
}
