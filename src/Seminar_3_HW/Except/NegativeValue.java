package Seminar_3_HW.Except;

public class NegativeValue extends Exception {
    public NegativeValue() {
    }

    public NegativeValue(String message) {
        super(message);
    }

    public NegativeValue(Throwable cause) {
        super(cause);
    }

    public NegativeValue(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeValue(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
