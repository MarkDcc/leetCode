package javaProgramNet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dongchen
 * @Data 2020/9/29
 * @Time 11:34
 */
public class PatterAndMatcher {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("Hello World Java");
        System.out.println(matcher.matches());
        //matcher = matcher.reset();
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
