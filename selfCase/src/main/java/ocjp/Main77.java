package ocjp;

/**
 * @author dongchen
 * @Data 2020/10/10
 * @Time 11:29
 */
class Star{
    public void doStuff(){
        System.out.println("Twinkling Star");
    }
}

interface Universe{
    public void doStuff();
}

class Sun extends Star implements Universe{
    @Override
    public void doStuff() {
        System.out.println("Shining Sun");
    }

}
public class Main77 {
    public static void main(String[] args) {
        Sun obj2 = new Sun();
        //Star obj3 = obj2;
        Star obj3 = new Sun();
        ( obj3).doStuff();//Shining Sun
        System.out.println(obj3.getClass().getName());
        ((Star) obj2).doStuff();//Shining Sun
        System.out.println(obj2.getClass().getName());
        ((Universe) obj2).doStuff();//Shining Sun
        System.out.println(obj2.getClass().getName());

    }
}
