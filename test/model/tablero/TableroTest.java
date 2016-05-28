/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tablero;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author brahvic
 */
public class TableroTest {
        
    @Test
    public void test01crearTablero(){
        Tablero tablero = new Tablero();
        Assert.assertTrue(tablero.isEmpty(new Posicion(0,0)));
      
    }
}
