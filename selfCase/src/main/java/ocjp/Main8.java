package ocjp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author dongchen
 * @Data 2020/9/3
 * @Time 9:06
 */
public class Main8 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2015-09-10").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.print(date);
    }
}
