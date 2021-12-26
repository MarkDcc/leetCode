package alro4.list;

import com.sun.org.apache.xerces.internal.util.SAXLocatorWrapper;
import sun.java2d.pipe.SolidTextRenderer;

/**
 * @author dongchen
 * @Data 2021/1/1
 * @Time 20:14
 */
public class HaveCycle {
    public static void main(String[] args) {
        //创建结点
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
        //产生环
        seven.next = third;

        //判断链表是否有环
        boolean circle = isCircle(first);
        System.out.println("first链表中是否有环：" + circle);
    }

    private static boolean isCircle(Node<String> first) {
        Node fast = first;
        Node slow = first;

        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow.equals(fast)){
                return true;
            }
        }
        return false;
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
