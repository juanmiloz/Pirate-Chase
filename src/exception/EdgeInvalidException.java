package exception;

public class EdgeInvalidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EdgeInvalidException() {
		super("The number of the vertex to conect is invalid");
	}

}
