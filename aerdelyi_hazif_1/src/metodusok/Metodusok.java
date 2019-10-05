/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Erdélyi Anna
 */
public class Metodusok {

    public static void main(String[] args) {
        System.out.println("feladat 1: ");
        feladat1(2, 6, 1);
        System.out.println("feladat 2: ");
        feladat2(2.3, 3.1, -2.1);
        System.out.println("feladat 3: ");
        feladat3(4.3, 2.1, 3, 4.57);
        System.out.println("feladat 4: ");
        System.out.println(feladat4(3, 4, 5));
        System.out.println("feladat 5: ");
        System.out.println(feladat5(2019, 1953));
        System.out.println("feladat 6: ");
        feladat6(4);
        System.out.println("feladat 7: ");
        feladat7(16, 8);
        System.out.println("feladat 8: ");
        System.out.println(feladat8(17));
        System.out.println("feladat 9: ");
        feladat9(11);
        System.out.println("feladat 10: ");
        feladat10b(12345);
        System.out.println("feladat 11: ");
        System.out.println(feladat11(4));
        System.out.println("feladat 12: ");
        feladat12(12, 29, 2);
        System.out.println("feladat 13: ");
        System.out.println(feladat13(12));
        System.out.println("feladat 14:");
        feladat14();
    }

    public static void feladat1(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c); //listába teszem a 3 számot
        Collections.sort(list); //meghívok egy rendezést, aminek a listát pm-ként odaadom (int comparable)
        System.out.println(list); //kiíratom a rendezett listát
    }

    public static void feladat2(double a, double b, double c) {
        List<Double> listMin = Arrays.asList(a, b, c);
        double min = Collections.min(listMin);

        List<Double> listMax = Arrays.asList(Math.abs(a), Math.abs(b), Math.abs(c));
        double max = Collections.max(listMax);
        System.out.println(min + ", " + max);
    }

    public static void feladat3(double a, double b, double c, double d) {
        if (d >= 0) {
            System.out.println(a + ", " + c + ", " + b + ", " + d);
        } else {
            System.out.println(a + ", " + b + ", " + d + ", " + c);
        }
    }

    public static boolean feladat4(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static int feladat5(int ev1, int ev2) {
        if (ev2 < ev1) {
            int ev = ev2;
            ev2 = ev1;
            ev1 = ev;
        }

        int count = 0;

        for (int i = ev1; i <= ev2; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static void feladat6(int a) {
        switch (a) { //ha belép, megnézi, h az a érték egyenlő-e 1-gyel, ha igen, megcsinálja, ha nem, megy tovább, stb.
            case 1:
                System.out.println("Elegtelen");
                break; //break azért kell, mert ha megtalálja sem hagyná abba
            case 2:
                System.out.println("Elegseges");
                break;
            case 3:
                System.out.println("Kozepes");
                break;
            case 4:
                System.out.println("Jo");
                break;
            case 5:
                System.out.println("Jeles");
                break;
            default:
                System.out.println("Ertekelhetetlen");
                break; //ha egyik case ág sem passzol, akkor ez hajtódik végre
        }
    }

    public static int feladat7(int a, int b) {
        int hanyados = 0;
        while (a >= b) {
            hanyados += 1;
            a -= b;
        }
        return hanyados;
    }

    public static boolean feladat8(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void feladat9(int n) {
        int[] fibonacci = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = i;
            }
            else{
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        System.out.println(Arrays.toString(fibonacci));// így tudom a tömböt kiíratni
    }
    
    /*public static void feladat10(int n){
        String reverseString = "";//üres szting, amibe visszafele "bepakolászom" a számokat
        char[] charArray = String.valueOf(n).toCharArray(); //karaktertömbbé alakítom a számot
        for(int i = charArray.length-1; i >= 0; i--){ //visszafele végiglépkedek a számon
            reverseString = reverseString + charArray[i]; //beteszem a sztringbe a számokat
        }
        int reverse = Integer.parseInt(reverseString); //intté alakítom a fordított számokat tartalmazó sztringet
        System.out.println(reverse); //kiíratás
    }*/
    
    public static void feladat10b(int n){
        int ujszam = 0;
        while (n != 0){
            ujszam = ujszam * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ujszam);
    }
    
    public static int feladat11(int n){
        if (n < 0 || n > 12){
            return -1;
        }
        else{
            int faktorialis = 1;
            for (int i = 1; i <= n; i++){
                faktorialis *= i;
            }
            return faktorialis;
        }
    }
    
    public static void feladat12(int n1, int n2, int k){
         if (n2 < n1) {
            int n = n2;
            n2 = n1;
            n1 = n;
        }
         
         for (int i = n1; i <= n2; i++) {
            if (i % k == 0 ) {
                System.out.print(i + " "); //csak felsorolas
            }
        }
        System.out.println(); //csak sor vege
    }
    
    public static int feladat13(int n){
        if (n < 0){
            return 0;
        }
        else if(n < 1){
            return 1;
        }
        
        int a; //számok forgása
        int b = 0;
        int c = 1;
        
        do{
            a = b;
            b = c;
            c = a + b;
            //System.out.println(c);
        } while (c <= n);
        return c;
    }
    
    public static void feladat14(){
        for (int i = 1; i < 1000; i++){
            int kob = 0;
            int szam = i;
            while(szam != 0){
                int szamjegy = szam % 10; //% 10 kell, mert az utolsó számjegy kell, nem a maradék
                kob += szamjegy * szamjegy * szamjegy;
                szam /= 10;
            }
            //System.out.println(i + " " + kob);
            if (kob == i){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
