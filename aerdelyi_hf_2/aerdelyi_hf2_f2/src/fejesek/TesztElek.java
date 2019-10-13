package fejesek;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erdélyi Anna
 */
public class TesztElek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sor = sc.nextLine().split(";");
        Diak[] d = new Diak[Integer.parseInt(sor[0])];
        d[0] = new Diak(sor[1], "", "piros");
        String kit = sor[2]; //kit keresünk

        for (int i = 1; i < d.length; i++) { //0. helyen van Péter
            sor = sc.nextLine().split(";"); //2. sortól dolgozzuk fel a standard inputról érkező információt
            d[i] = new Diak(sor[0], sor[1], "");
        }

        for (int i = 1; i < d.length; i++) { //Péter a helyén van, az elsőt nem vizsgáljuk

            int j = i;
            while (j < d.length) {
                if (d[j].getElozo().equals(d[i - 1].getNev())) {
                    if (d[i - 1].getSapka().equals("piros")) {
                        d[j].setSapka("kek");
                    } else {
                        d[j].setSapka("piros");
                    }

                    //helycsere segédváltozóval
                    Diak tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                    break;
                }
                j++;
            }
        }
        
        int piros = 0;
        int kek = 0;
        for(int i = 0; i < d.length; i++){
            if(d[i].getNev().equals(kit)){
                System.out.println(piros + " " + kek);
                break; // arra az esetre, ha egy gyerek neve többször is szerepel (pl. 2 Zoli van az osztályban)
            }
            
            if(i % 2 == 0){
                piros++;
            }
            else{
                kek++;
            }
        }
    }
}
