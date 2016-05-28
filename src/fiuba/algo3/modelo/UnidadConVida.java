package fiuba.algo3.modelo;

public abstract class UnidadConVida {
	
	public boolean existe(){
		return true;
	}

	//-------------------vida---------------
    private int vida;
    public abstract int getVidaMaxima();
    public int getVida(){
    	return vida;
    }
}
