package ss19_string_regex.exercise.validate_class;


public class MainValidateClass {
    private static ValidateClass validateClass;

    public static final String[] validClass = new String[]{"C1234G","A4567H","P2342L"};
    public static final String[] invalid = new String[]{"D2333L","F6727M","P2_23J"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String valid: validClass){
            boolean isValid = validateClass.validate(valid);
            System.out.println("Validate is "+  valid + "is valid "+isValid);
        }
        for (String valid : invalid){
            boolean isValid = validateClass.validate(valid);
            System.out.println("Validate is "+  valid + "is valid "+isValid);
        }
    }
}

