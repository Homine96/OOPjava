package Seminar_3_HW.Except;

public class IncorrectTriangle extends Exception{
    public IncorrectTriangle() {
    }

    public IncorrectTriangle(String message) {
        super(message);
    }

    public IncorrectTriangle(Throwable cause) {
        super(cause);
    }

    public IncorrectTriangle(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectTriangle(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
