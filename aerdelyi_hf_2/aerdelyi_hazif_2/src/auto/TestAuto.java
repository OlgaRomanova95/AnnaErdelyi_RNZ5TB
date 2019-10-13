/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.Arrays;

/**
 *
 * @author Erdélyi Anna
 */
public class TestAuto {
    public static void main(String[] args) {
        Auto[] autok = new Auto[]{
            new Auto("A1",150),
            new Auto("B1",15000),
            new Auto("C1",155),
            new Auto("D1",160),
            new Auto("E1",650),
            
            new Teherauto(151, "F1", 1750),
            new Teherauto(100221, "G1", 14750),
            new Teherauto(1513, "H1", 18502),
            new Teherauto(13240, "I1", 153),
            new Teherauto(15454351, "J1", 170),
        };
        
        Teherauto[] teherautok = {
            new Teherauto(15551, "F2", 175),
            new Teherauto(15671, "F3", 170),
            new Teherauto(151211, "F4", 14750),
            new Teherauto(15891, "F5", 5750),
            new Teherauto(15198, "F6", 87750),
            new Teherauto(1223151, "F7", 7560),
            new Teherauto(14551, "F8", 17650),
            new Teherauto(65151, "F9", 1250),
            new Teherauto(76151, "F10", 1950),
            new Teherauto(5151, "F11", 17960),
        };
        
        rendez(teherautok);
        System.out.println(keres(autok));
    }
    
    public static void rendez(Teherauto[] tehera){ //MaxSzallithatoTeherCsokkenoleg
        Arrays.sort(tehera);
        System.out.println(Arrays.toString(tehera));
    }
    
    public static Auto keres(Auto[] auto){
        if(auto.length == 0){
            return null;
        }
        Arrays.sort(auto);
        return auto[0];
    }
}
