package fiuba.algo3.test.unidadesVivientes;

import fiuba.algo3.modelo.equipos.Autobots;
import fiuba.algo3.modelo.unidadesVivientes.UnidadConVida;

public class MentiPrime extends UnidadConVida {

	public MentiPrime(){
		super(new Autobots());
	}
	@Override
	public int getVidaMaxima() {
		return 100;
	}

	@Override
	protected int getDistanciaAtaque() {
		return 3;
	}

	@Override
	protected int getPuntosAtaque() {
		return 10;
	}

	@Override
	protected int getDistanciaMovimiento() {
		return 4;
	}

}
