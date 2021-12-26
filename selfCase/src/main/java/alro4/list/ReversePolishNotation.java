package alro4.list;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 10:39
 */
public class ReversePolishNotation {
    public static void main(String[] args) {
        //��׺���ʽ 3*��17-15��+18/6 ���沨�����ʽ���� 6+3=9
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = caculate(notation);
        System.out.println("�沨�����ʽ�Ľ��Ϊ��" + result);
    }

    private static int caculate(String[] notation) {
        Stack<Integer> stack = new Stack<>();
        Integer o1;
        Integer o2;
        Integer result;
        for (int i = 0; i < notation.length; i++) {
            switch (notation[i]) {
                case "+":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2 + o1;
                    stack.push(result);
                    break;
                case "-":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2 - o1;
                    stack.push(result);
                    break;
                case "*":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2 * o1;
                    stack.push(result);
                    break;
                case "/":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2 / o1;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(notation[i]));
            }
        }
        return stack.pop();

    }
}
