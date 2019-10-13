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
public class Nyilas extends Katona {

    private int lotav;

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, int vedoero, int tamadoero) {
        super(vedoero, tamadoero);
        this.lotav = lotav;
    }

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public int getTamadoero() {
        return super.getTamadoero() + this.getLotav();
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getTamadoero() + ", VE: " + this.getVedoero();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Nyilas)){
            return false;
        }
        
        Nyilas other = (Nyilas) obj;
        return super.equals(obj) && this.getLotav() == other.getLotav();
    }

}
