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
public class Tablero {

    private ContenedorCasilleros tablero ;

    public Tablero(){
    this.tablero = new ContenedorCasilleros();
        for (Integer i = 0; i < 20;i++){
            this.tablero.agregarCasilleroVacio(new Posicion(i%50,i/50));
        }
    }
    
    public boolean isEmpty(Posicion posicion) {
        return this.tablero.isEmpty(posicion);
    }
    
}
