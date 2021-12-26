package ocjp;

/**
 * @author dongchen
 * @Data 2020/10/10
 * @Time 9:22
 */
public class Main80 {
    int fvar;//可以被实例对象引用
    static int cvar;//可以被实例对象或者类对象引用

    public static void main(String[] args) {

        Main80 main80 = new Main80();
        cvar=400;
       // this.fvar = 200;
        main80.fvar = 200;
        Main80.cvar = 400;

        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;			//line n1
      //  String s4 = (String)(s3 * s2);		//line n2
       // System.out.println("Sum is " + s4);

    }
    public void test(){
        this.fvar =200;
    }
}
