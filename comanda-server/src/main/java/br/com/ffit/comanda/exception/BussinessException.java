package br.com.ffit.comanda.exception;

public class BussinessException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BussinessException(String message) {
		super(message);
	}

}
