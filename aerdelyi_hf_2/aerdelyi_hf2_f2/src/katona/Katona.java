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
public class Katona {
    private int vedoero;
    private int tamadoero;

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public Katona(int vedoero, int tamadoero) {
        this.vedoero = vedoero;
        this.tamadoero = tamadoero;
    }

    public Katona() {
        this(5, 5);
    }

    @Override
    public String toString() {
        return "VE: " + vedoero + ", TE: " + tamadoero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Katona)){
            return false;
        }
        
        Katona other = (Katona) obj;
        return this.vedoero == other.vedoero && this.tamadoero == other.tamadoero;
    }
    
    
}
