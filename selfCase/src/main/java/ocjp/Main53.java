package ocjp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongchen
 * @Data 2020/9/25
 * @Time 10:42
 */
public class Main53 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String str = sb.toString();
        List<String> ls = new ArrayList<>();
        ls.add(str);
        System.out.println(sb.getClass());
        System.out.println(str.getClass());
        System.out.println(ls.getClass());
        //getClass()返回的是运行时类对象
    }
}
