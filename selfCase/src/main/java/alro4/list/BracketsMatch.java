package alro4.list;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 10:26
 */
public class BracketsMatch {

    public static void main(String[] args) {
        String str = "上海((长安)())";
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配："+match);
    }

    private static boolean isMatch(String str) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("(")){
                stack.push(s);
            }

            if(s.equals(")")){
                String result = stack.pop();
                if(result == null){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
