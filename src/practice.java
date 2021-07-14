import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice {
    String patternRule="^[a-z]{4}$";


    private class string {
        String FirstName ="shar";
        public static void ainaddUserInDataabase(String FirstName){
            Pattern p = Pattern.compile(FirstName);
            Matcher m = p.matcher(FirstName);
            Boolean b = m.matches();
        }
    }
}
