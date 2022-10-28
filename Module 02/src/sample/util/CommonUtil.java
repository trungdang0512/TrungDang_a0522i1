package sample.util;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommonUtil {
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
    public static DateTimeFormatter getDateFormat() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
}
