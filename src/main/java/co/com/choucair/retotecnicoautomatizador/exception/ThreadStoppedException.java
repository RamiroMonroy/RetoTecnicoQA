package co.com.choucair.retotecnicoautomatizador.exception;

public class ThreadStoppedException extends RuntimeException {

    public ThreadStoppedException(String message, Throwable cause){
        super(message,cause);
    }
}
