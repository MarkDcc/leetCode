package alro4.list;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 10:20
 */
public class StackTest {
    public static void main(String[] args) {
        //����ջ����
        Stack<String> stack = new Stack<>();

        //����ѹջ
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println("------------------------------");
        //���Ե�ջ
        String result = stack.pop();
        System.out.println("������Ԫ���ǣ�"+result);
        System.out.println("ʣ���Ԫ�ظ�����"+stack.size());

    }
}
