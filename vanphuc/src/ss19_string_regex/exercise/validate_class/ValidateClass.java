package ss19_string_regex.exercise.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {

    private static final String VALIDATE_CLASS = "^[CAP][0-9]{4}[G-M]$";

    public ValidateClass() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(VALIDATE_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
