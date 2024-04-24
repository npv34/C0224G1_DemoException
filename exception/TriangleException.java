package exception;

public class TriangleException extends Exception {
    private String message;
    public TriangleException(String message) {
        super(message);
    }
}
