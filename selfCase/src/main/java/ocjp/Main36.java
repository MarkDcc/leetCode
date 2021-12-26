package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/16
 * @Time 9:45
 */
public class Main36 {
    static void test(int ref, int raf){
        ref = 20;
        raf = 20;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i< arr.length;i++){
            arr[i] = i;
        }
        int[][] num1={{78,98},{65,75,63},{98}};
        System.out.println(num1.length);
        System.out.println(arr.length);
        String str = "javaja";
        str.substring(2);
//        Map<String, Function<Map<String, Object>, Object>> specialLogicalFieldFunctionMap = new HashMap<>();


    }
}
