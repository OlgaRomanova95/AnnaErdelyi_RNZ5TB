/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katona;

/**
 *
 * @author Erdélyi Anna
 */
public class Landzsas extends Katona {

    public Landzsas(int vedoero, int tamadoero) {
        super(vedoero, tamadoero);
    }

    public Landzsas() {
    }

    @Override
    public String toString() {
        return "Landzsas: TE: " + this.getTamadoero() + ", VE: " + this.getVedoero();
    }
}
