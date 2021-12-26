package ocjp;


import dailyLearn.ArrayLearn;
import dailyLearn.test.*;

/**
 * @author dongchen
 * @Data 2020/9/4
 * @Time 9:49
 */
public class Main11 {
    Test test;
    ArrayLearn arrayLearn;
    public static void main(String[] args) {
        int m = 10;
        for(;m>0;){
            int n = m;
            while (n>=0){
                System.out.println(n);
                n-=2;
            }
            m = m/n;
        }

    }


}
