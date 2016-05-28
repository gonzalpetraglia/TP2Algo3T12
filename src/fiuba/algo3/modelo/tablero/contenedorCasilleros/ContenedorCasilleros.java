/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo.tablero.contenedorCasilleros;

import fiuba.algo3.modelo.tablero.Posicion;
import java.util.HashMap;

/**
 *
 * @author brahvic
 */
public class ContenedorCasilleros  {
    private HashMap<Posicion,Casillero> misCasilleros ;

    public ContenedorCasilleros(){
        this.misCasilleros = new HashMap<Posicion,Casillero>();
    }

    public void agregarCasilleroVacio(Posicion posicion) {
        this.misCasilleros.put(posicion,new Casillero(posicion));
    }

    public boolean isEmpty(Posicion posicion) {
        return (this.misCasilleros.get(posicion)).isEmpty();
        
    }

}
