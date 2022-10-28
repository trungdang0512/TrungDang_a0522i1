package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexUtils {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String SERVICE_CODE = "^(SV)+(VL|HO|RO)-[\\d]{4}$";
    public static final String SERVICE_NAME ="^[A-Z]+(\\[a-z]+)*$";
    private static final String AREA = "^([1-9][\\\\d]*(\\\\.[\\\\d]*)?)|(0\\\\.[\\\\d]+)$";
    private static final String HIRING_PICE = "^[1-9][\\\\d]*$";
    private static final String NUMBER_PEOPLE = "";
    private static final String NUMBER_FLOOR = "";
    private static final String STANDARD = "";
    private static final String DATEOFBIRTH = "";

    public boolean validate(String input, String validate){
        pattern = Pattern.compile(validate);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
