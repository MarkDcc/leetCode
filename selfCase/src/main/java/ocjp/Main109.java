package ocjp;

import java.util.ArrayList;

/**
 * @author dongchen
 * @Data 2020/10/21
 * @Time 11:07
 */
public class Main109 {
    static boolean bVar;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("SE");
        list.add("EE");
        list.add("ME");
        list.add("SE");
        list.add("EE");
        list.remove("SE");//删除第一个匹配的
        System.out.println(list);
    }
}
