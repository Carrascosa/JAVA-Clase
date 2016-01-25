package Pato;

public class Pato {

	private int posicion;
	
	/**
	 * Constructor de clase
	 * @param pos
	 */
	public Pato(int pos)
	{
		this.posicion=pos;
	}
	
	/**
	 * M�todo que pide la cantidad de pasos adelante
	 * @param pasos
	 * @return devuelve los pasos que se le hann introducido
	 */
	public int AndarHaciaAdelante(int pasos)
	{
		return this.posicion+=pasos;
	}
	
	/**
	 * M�todo que pide la cantidad de pasos hacia atr�s
	 * @param pasos
	 * @return devuelve los pasos que se le hann introducido
	 */
	public int AndarHaciaAtras(int pasos)
	{
		return this.posicion-=pasos;
	}
	
	/**
	 * M�todo que dice la posici�n en la que se encuentra el pato
	 * @return devuelve la posici�n del pato
	 */
	public int DimePosicion()
	{
		return this.posicion;
	}
	
}
