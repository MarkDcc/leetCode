package ocjp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongchen
 * @Data 2020/11/3
 * @Time 9:55
 */
public class Main146 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        if (list.remove("1")){
            list.remove("2");
        }

        StringBuilder sb = new StringBuilder();
        sb.delete(0,sb.length());
        System.out.println(list);
    }
}
