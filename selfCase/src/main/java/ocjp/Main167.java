package ocjp;

/**
 * @author dongchen
 * @Data 2020/11/10
 * @Time 9:49
 */
public class Main167 {
    public static void main(String[] args) {
        int num = 5;

        do {
            System.out.println(num-- + "");
        }while (num == 0);
        System.out.println( 28 + 5 <= 4 +29 );
        Boolean flag = new Boolean(null);
        Boolean flag1 = new Boolean("test");
        System.out.println(flag);
        System.out.println(flag1);
    }

}
