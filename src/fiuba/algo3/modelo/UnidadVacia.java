/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import fiuba.algo3.modelo.equipos.Ninguno;

/**
 *
 * @author brahvic
 */
public class UnidadVacia extends Unidad{

    public UnidadVacia() {
    	super(new Ninguno());
    }

    @Override
    public boolean existe() {
        return false ;
    }
    
}
