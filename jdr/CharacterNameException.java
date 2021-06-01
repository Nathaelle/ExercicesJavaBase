package jdr;

public class CharacterNameException extends CharacterException {

	public CharacterNameException() {
	}

	public CharacterNameException(String message) {
		super(message);
	}

	public CharacterNameException(Throwable cause) {
		super(cause);
	}

	public CharacterNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public CharacterNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
