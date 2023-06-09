package infrastructure;

public class ValidationHelper {
    public static Boolean Validate(String someText){

        if(IsNullOrEmptyOrBlank(someText)){
            return false;
        };

        try {
            int parseInt =  Integer.parseInt(someText);
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }
    public static Boolean ValidateString(String someText){

        if(IsNullOrEmptyOrBlank(someText)){
            return false;
        };

        try {
            int parseInt =  Integer.parseInt(someText);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static Boolean IsNullOrEmptyOrBlank(String someText){
        if(someText.isEmpty() || someText.equals(null) || someText.isBlank()){
            return  true;
        }
        return false;
    }
}
