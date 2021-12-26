package ocjp;

/**
 * @author dongchen
 * @Data 2020/11/11
 * @Time 10:50
 */
public class TestA extends Root {
    public static void main(String[] args) {
        Root r = new TestA();
        System.out.println(r.method1());		// line n1
        System.out.println(r.method2());		// line n2
    }
}
class Root {
    private static final int MAX = 20000;
    private int t = 100;

    public int method1() {
        int a = 100 + MAX;
        int y = t;// line n3
        return a;
    }

    protected int method2() {
        int a = 200 + MAX;                    // line n4
        return a;
    }
    public static void test(){
        int x = MAX;

        //静态方法不能引用实例变量
        //int y = t;
    }
}

