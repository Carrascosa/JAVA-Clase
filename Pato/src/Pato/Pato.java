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
	 * Método que pide la cantidad de pasos adelante
	 * @param pasos
	 * @return devuelve los pasos que se le hann introducido
	 */
	public int AndarHaciaAdelante(int pasos)
	{
		return this.posicion+=pasos;
	}
	
	/**
	 * Método que pide la cantidad de pasos hacia atrás
	 * @param pasos
	 * @return devuelve los pasos que se le hann introducido
	 */
	public int AndarHaciaAtras(int pasos)
	{
		return this.posicion-=pasos;
	}
	
	/**
	 * Método que dice la posición en la que se encuentra el pato
	 * @return devuelve la posición del pato
	 */
	public int DimePosicion()
	{
		return this.posicion;
	}
	
}
