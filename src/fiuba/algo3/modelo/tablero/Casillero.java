/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo.tablero;

import fiuba.algo3.modelo.Posicion;
import fiuba.algo3.modelo.Unidad;
import fiuba.algo3.modelo.UnidadVacia;

/**
 *
 * @author brahvic
 */
public class Casillero {
    
    public Posicion posicion;
    public Unidad unidad ;

    public Casillero(Posicion posicion) {
        this.posicion = posicion;
        this.unidad = new UnidadVacia();
    }

    public boolean isEmpty() {
        return (!(this.unidad.existe()));
    }

}
