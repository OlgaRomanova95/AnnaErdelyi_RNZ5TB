/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Erdélyi Anna
 */
public class Auto implements Comparable<Auto>{

    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasDatuma = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", motorTeljesitmeny=" + motorTeljesitmeny + ", gyartasDatuma=" + gyartasDatuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // aktualis this, amivel osszehasonlitom obj
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) { //megnezi, hogy u.abba az osztalyba tartozik-e
            return false;
        }
        final Auto other = (Auto) obj; // tipuskenyszer.
        if (this.motorTeljesitmeny != other.motorTeljesitmeny) {
            return false;
        }
        if (!Objects.equals(this.rendszam, other.rendszam)) {
            return false;
        }
        if (!Objects.equals(this.gyartasDatuma, other.gyartasDatuma)) {
            return false;
        }
        return true; //ha eddig eljutott a kod, biztos megegyezik a 2 vizsgált objektum
    }

    @Override
    public int compareTo(Auto o) {
        if(this.motorTeljesitmeny < o.motorTeljesitmeny){
            return 1;
        }
        else if(this.motorTeljesitmeny == o.motorTeljesitmeny){
            return 0;
        }
        else{
            return -1;
        }
    }

}
