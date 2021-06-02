package contacts;

public class ErrorException extends Exception {

	private static final long serialVersionUID = 1L;

	public ErrorException() {
		super();
	}

	public ErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorException(String message) {
		super(message);
	}

	public ErrorException(Throwable cause) {
		super(cause);
	}

}
