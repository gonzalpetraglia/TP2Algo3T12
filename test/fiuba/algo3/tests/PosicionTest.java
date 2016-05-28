package fiuba.algo3.tests;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.Posicion;
@SuppressWarnings("deprecation")
public class PosicionTest {

	@Test
	public void testEmpiezaEn0() {
		Posicion pos =new Posicion();
		Assert.assertEquals(pos.getX(), 0);
		Assert.assertEquals(pos.getY(), 0);
	}
	
	@Test
	public void testEmpiezaEnDistintoDe0() {
		Posicion pos =new Posicion(1,5);
		Assert.assertEquals(pos.getX(), 1);
		Assert.assertEquals(pos.getY(), 5);
	}
	
	@Test
	public void testIgualdadSonIguales() {
		Posicion pos1 =new Posicion(1,5);
		Posicion pos2 =new Posicion(1,5);
		Assert.assertEquals(pos1, pos2);
		Assert.assertTrue(pos1.equals(pos2));
	}
	
	@Test
	public void testIgualdadSonDistintos() {
		Posicion pos1 =new Posicion(1,5);
		Posicion pos2 =new Posicion(1,6);
		Assert.assertFalse(pos1.equals(pos2));
	}
	
	
	@Test
	public void testManhattanDiferenteX() {
		Posicion pos1 =new Posicion(1,1);
		Posicion pos2 =new Posicion(6,1);
		Assert.assertEquals(pos1.manhattan(pos2),5,0);
	}
	
	@Test
	public void testManhattanDiferenteY() {
		Posicion pos1 =new Posicion(1,1);
		Posicion pos2 =new Posicion(1,4);
		Assert.assertEquals(pos1.manhattan(pos2),3,0);
	}
	
	@Test
	public void testManhattanDiferentexy() {
		Posicion pos1 =new Posicion(1,1);
		Posicion pos2 =new Posicion(5,6);
		Assert.assertEquals(pos1.manhattan(pos2),5,0);
	}
	
	@Test
	public void testSuma() {
		Posicion pos1 =new Posicion(1,1);
		Posicion pos2 =new Posicion(5,6);
		Assert.assertEquals(pos1.suma(pos2),new Posicion(6,7));
	}
	
	@Test
	public void testResta() {
		Posicion pos1 =new Posicion(1,1);
		Posicion pos2 =new Posicion(5,6);
		Assert.assertEquals(pos1.resta(pos2),new Posicion(-4,-5));
	}
	

}
