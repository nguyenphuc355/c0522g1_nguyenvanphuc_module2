package case_study_2.exception;

public class NotFoundBankAccountException extends Exception{
    public NotFoundBankAccountException (String message){
        super(message);
    }
}
