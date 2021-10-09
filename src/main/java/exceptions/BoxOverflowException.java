package exceptions;

//declaring checked exception

//if we would like to declare runtime exception we should do:
// public class BoxOverflowException extends RuntimeException
public class BoxOverflowException extends Exception {

    //exception can have additional state
    private final int errorCode;

    public BoxOverflowException(String message ,int errorCode) {
        //invoke constructor from Exception class
        super(message);
        this.errorCode = errorCode;
    }

    //exception can have additional methods
    public int getErrorCode(){
        return errorCode;
    }
}
