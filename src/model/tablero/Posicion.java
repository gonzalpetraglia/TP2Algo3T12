/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tablero;

import java.util.Objects;

/**
 *
 * @author brahvic
 */
public class Posicion {
    
    private Integer x;
    private Integer y ;
    
    public Posicion(Integer x, Integer y) {
        this.x = x;
        this.y = y;       
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Posicion))
            return false;
        Posicion posicion = (Posicion) obj ;
        return ( (this.x.equals(posicion.getX()))&&(this.y.equals(posicion.getY())) );
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.x);
        hash = 79 * hash + Objects.hashCode(this.y);
        return hash;
    }


    private Integer getX() {
        return this.x ;
    }

    private Integer getY() {
        return this.y ;
    }

}
