/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Erdélyi Anna
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.nextLine();
        int orakSzama = sc.nextInt();
        sc.nextLine();
        Ora[] aktualisNap = new Ora[orakSzama];
        for (int i = 0; i < orakSzama; i++){
            int kod = sc.nextInt();
            String nev = sc.next();
            int kezdet = sc.nextInt();
            sc.nextLine();
            aktualisNap[i] = new Ora(kod, nev, kezdet);
        }
        
        Orarend orarend = new Orarend(nap);
        for (int i = 0; i < orakSzama; i++){
            System.out.println(orarend.oratHozzaad(aktualisNap[i]));
        }
        
        System.out.println(orarend);
    }
}
