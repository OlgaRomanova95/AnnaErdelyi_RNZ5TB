/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author Erdélyi Anna
 */
public class Teherauto extends Auto {

    private int maxSzallithatoTeher;

    public Teherauto(int maxSzallithatoTeher, String rendszam, int motorTeljesitmeny) {
        super(rendszam, motorTeljesitmeny); //datumot nem kell pluszba ideirni, mert nem a pm-e szulooszt. konstruktoranak
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto {" + "maxSzallithatoTeher = " + maxSzallithatoTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherauto other = (Teherauto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Auto o) {
        if (o instanceof Teherauto) {
            Teherauto aktualis = (Teherauto) o;
            if (this.maxSzallithatoTeher < aktualis.maxSzallithatoTeher) {
                return 1;
            } else if (this.maxSzallithatoTeher == aktualis.maxSzallithatoTeher) {
                return 0;
            } else {
                return -1;
            }
        }
        else{
            return super.compareTo(o); //hivatkozok az Auto oszt-ban levo hasonlitasra
        }
    }

}
