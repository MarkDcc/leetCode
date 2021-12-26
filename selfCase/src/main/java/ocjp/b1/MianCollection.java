package ocjp.b1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongchen
 * @Data 2020/10/15
 * @Time 15:04
 */
public class MianCollection {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "old";
        HashMap<String, Map<String,String>> map = new HashMap<>();
        HashMap<String, String> value = new HashMap<>();
        map.put(str1,value);
        value.put(str1,str2);
        System.out.println(map.get(str1));
        System.out.println(str2);
    }
}
