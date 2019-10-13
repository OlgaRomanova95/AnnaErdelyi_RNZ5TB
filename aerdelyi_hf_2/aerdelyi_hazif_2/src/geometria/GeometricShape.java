package geometria;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erdélyi Anna
 */
public class GeometricShape {

    private String colour;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this("white", false); // a default kostruktor itt hívja meg; konstruktorok egymásba pakolása
    }

    public GeometricShape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "GeometricShape {" + "colour = " + colour + ", filled = " + filled + ", dateCreated = " + dateCreated + '}';
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
