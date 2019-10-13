/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopapirollo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erdélyi Anna
 */
public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (String sor = sc.nextLine(); !sor.equals("vege"); sor = sc.nextLine()) {
            int gepLep = r.nextInt(3);
            switch (sor) {
                case "ko":
                    switch (gepLep) {
                        case 0:
                            System.out.println("dontetlen");
                            break;
                        case 1:
                            System.out.println("gep nyert");
                            break;
                        case 2:
                            System.out.println("jatekos nyert");
                            break;
                    }
                    break;
                case "papir":
                    switch (gepLep) {
                        case 0:
                            System.out.println("jatekos nyert");
                            break;
                        case 1:
                            System.out.println("dontetlen");
                            break;
                        case 2:
                            System.out.println("gep nyert");
                            break;
                    }
                    break;
                case "ollo":
                    switch (gepLep) {
                        case 0:
                            System.out.println("gep nyert");
                            break;
                        case 1:
                            System.out.println("jatekos nyert");
                            break;
                        case 2:
                            System.out.println("dontetlen");
                            break;
                    }
                    break;
            }
        }
    }

}
