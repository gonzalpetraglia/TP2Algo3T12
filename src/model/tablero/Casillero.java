/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tablero;

/**
 *
 * @author brahvic
 */
public class Casillero {
    
    public Posicion posicion;
    public Unidad unidad ;

    Casillero(Posicion posicion) {
        this.posicion = posicion;
        this.unidad = new UnidadVacia();
    }

    public boolean isEmpty() {
        return this.unidad.existe();
    }

}
