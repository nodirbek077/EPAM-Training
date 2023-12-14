import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static boolean isDigit(String s) {
       return Pattern.compile("[0-9]").matcher(s).matches();
    }
    public static void main(String[] args) {
        System.out.println(isDigit("a5"));
    }
}
