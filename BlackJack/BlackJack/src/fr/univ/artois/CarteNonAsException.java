package fr.univ.artois;

/**
 * Exception levée lorsqu'un joueur désire inverser la valeur de sa carte mais que cette dernière 
 * n'est pas un As
 * @author Browarr
 *
 */
public class CarteNonAsException extends Exception{
	
	public CarteNonAsException(String msg){
		super(msg);
	}

}
