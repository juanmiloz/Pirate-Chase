package exception;

public class AmountOfDataException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AmountOfDataException() {
		super("The amount of data is incorrect, the number of connections has to be equal to the amount of weights");
	}

}
