package ocjp;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/10/21
 * @Time 11:10
 */
public class Main104 {

    public static void main(String[] args) {
        byte[] body = {'c','d'};
        System.out.println(Arrays.toString(body));
        String tet = new String(body);
        System.out.println(tet);
    }
}
