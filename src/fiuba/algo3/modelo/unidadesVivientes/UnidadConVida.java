package fiuba.algo3.modelo.unidadesVivientes;

import fiuba.algo3.modelo.Unidad;
import fiuba.algo3.modelo.equipos.Equipo;
import fiuba.algo3.modelo.tablero.Posicion;

public abstract class UnidadConVida extends Unidad{
	
	protected UnidadConVida(Equipo equipo) {
		super(equipo);
		vida = getVidaMaxima();
	}
	@Override
	public boolean existe(){
		return true;
	}

	//-------------------vida---------------
    private int vida;
    public abstract int getVidaMaxima();
    public int getVida(){
    	return vida;
    }
    @Override
	public void recibirDanio(Unidad atacante, int danio) throws FriendlyFireException {
    	if(atacante.es(equipo)){
    		throw new FriendlyFireException();
    	}
    	vida -= danio;
    }
    
    //------------------ataque-----------------
    public boolean puedeAtacar(Posicion a, Posicion desde){
    	return a.distanciaA(desde)<=getDistanciaAtaque();
    }
    
    public void atacarA(Unidad receptor) throws FriendlyFireException{
    	receptor.recibirDanio(this,getPuntosAtaque());
    }
    protected abstract int getDistanciaAtaque();
    protected abstract int getPuntosAtaque();
    
	//-----------------movimiento--------------
    public boolean puedeMoverse(Posicion a, Posicion desde){
    	return a.distanciaA(desde)<=getDistanciaMovimiento();
    }
    protected abstract int getDistanciaMovimiento();
}
