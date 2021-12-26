package ocjp;

/**
 * @author dongchen
 * @Data 2020/11/5
 * @Time 10:43
 */
public class Main152 {
    private int x = 0;
    private int y = 0;
    public static void main(String[] args) {
        Main152 accApp = new Main152();
        accApp.printThis(1, 2);
        accApp.printThat(3 ,4);
    }
    public void printThis(int x, int y) {
        x = x;
        y = y;
        System.out.println("x:" + this.x + " y:"+ this.y);
    }
    public void printThat(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x:" + this.x + " y:"+ this.y);
    }

}
