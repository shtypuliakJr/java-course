package controllers.exceptions;

public class LocaleSyntaxException extends RuntimeException {
    public LocaleSyntaxException(String message) {
        super(message);
    }
}
