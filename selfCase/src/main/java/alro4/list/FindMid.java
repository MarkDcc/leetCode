package alro4.list;

/**
 * @author dongchen
 * @Data 2021/1/1
 * @Time 20:07
 */
public class FindMid {
    public static void main(String[] args) {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;

        //查找中间值
        String mid = getMid(first);
        System.out.println("中间值为：" + mid);
    }

    private static String getMid(Node<String> first) {
        Node<String> fast = first;
        Node<String> slow = first;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.item;
    }

    private static class Node<T> {
        private T item;
        private Node next;

        private Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
