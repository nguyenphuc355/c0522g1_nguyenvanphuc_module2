package case_study.exception;

public class NumberIsLessThanZeroException extends Exception{
    public NumberIsLessThanZeroException(String message){
        super(message);
    }
}
