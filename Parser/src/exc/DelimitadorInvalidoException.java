package exc;

public class DelimitadorInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DelimitadorInvalidoException (String message){
        super("A string " + message + " é invalida, escolha apenas um caracter");
	}
}
