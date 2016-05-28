package fiuba.algo3.modelo;

import fiuba.algo3.modelo.equipos.Equipo;

public abstract class Unidad {
	
	
    public abstract boolean existe();
    
    
    //-------------------equipo-------------
    private final Equipo equipo;
    Unidad(Equipo equipo){
    	this.equipo = equipo;
    }
    
    public boolean es(Equipo e){
    	return equipo.equals(e);
    }
    
    
}
