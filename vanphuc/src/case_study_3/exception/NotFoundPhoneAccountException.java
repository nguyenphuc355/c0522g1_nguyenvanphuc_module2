package case_study_3.exception;

public class NotFoundPhoneAccountException extends Exception{
    public NotFoundPhoneAccountException(String message){
        super(message);
    }
}
