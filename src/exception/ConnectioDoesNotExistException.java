package exception;

public class ConnectioDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnectioDoesNotExistException() {
		super("The searched connecion does not exist");
	}

}
