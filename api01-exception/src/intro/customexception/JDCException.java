package intro.customexception;

public class JDCException extends RuntimeException{

	private static final long serialVersionUID = 113439670920565213L;

	public JDCException(String errorLog) {
		super(errorLog);
	}
	
}
