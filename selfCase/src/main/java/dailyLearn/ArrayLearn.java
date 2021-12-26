package dailyLearn;

/**
 * @author dongchen
 * @Data 2020/10/16
 * @Time 16:42
 */
public class ArrayLearn {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[]{};
        int[] arr2 = {1,2,3};

        int[][] arr3 = {{1,2},{3,4,5},{6,7}};
//        for (int i = 0; i < arr3.length; i++){
//            for(int j = 0; j<arr3[i].length;j++){
//                System.out.println(arr3[i][j]);
//            }
//        }

        for(int i = 0; i < arr3.length;i++){
           for (int j = 0; j < arr3[i].length;j++){
               if(arr3[i].length == j+1){
                   System.out.println(arr3[i][j]);
               }
           }
        }
    }
}
