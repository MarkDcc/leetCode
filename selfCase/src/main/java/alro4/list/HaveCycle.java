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
        //�������
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        //��ɽ��֮���ָ��
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //������
        seven.next = third;

        //�ж������Ƿ��л�
        boolean circle = isCircle(first);
        System.out.println("first�������Ƿ��л���" + circle);
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
