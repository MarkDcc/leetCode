package alro4.tree;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 20:40
 */
public class OrderSymbolTableTest {
    public static void main(String[] args) {
        //����������ű����
        OrderSymbolTable<Integer, String> table = new OrderSymbolTable<>();

        table.put(1,"����");
        table.put(2,"����");
        table.put(4,"����");
        table.put(7,"����");

        table.put(3,"����");
    }
}
