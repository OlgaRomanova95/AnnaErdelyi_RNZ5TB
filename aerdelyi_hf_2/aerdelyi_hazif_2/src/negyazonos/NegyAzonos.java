/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyazonos;

/**
 *
 * @author Erdélyi Anna
 */
public class NegyAzonos {

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] szamok1 = {1, 2, 2, 2, 2};
        int[] szamok2 = {1, 2, 3, 4, 5};
        int[] szamok3 = {3};
        System.out.println(isConsecutiveFour(szamok1));
        System.out.println(isConsecutiveFour(szamok2));
        System.out.println(isConsecutiveFour(szamok3));
    }
}
