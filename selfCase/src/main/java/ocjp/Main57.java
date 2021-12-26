package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/27
 * @Time 18:01
 */
public class Main57 {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public static void main(String[] args) {
        Main57 obj1 = new Main57();
        Main57 obj2 = new Main57();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }

}
