package ss17_StringRegex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String CLASS_NAME = "^(C|A|P)+[0-9]{4}+(G|H|I|K|L|M)";

    public ClassNameRegex() {
        pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String input){
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
