package alro4.list;

import org.w3c.dom.Node;

/**
 * @author dongchen
 * @Data 2021/1/1
 * @Time 20:19
 */
public class FindCycleEntrance {
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
        //产生环
        seven.next = third;

        //查找环的入口结点
        Node<String> entrance = getEntrance(first);
        System.out.println("first链表中环的入口结点元素为："+entrance.item);
    }

    private static Node<String> getEntrance(Node<String> first) {
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> tmp =  null;
        while (fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow.equals(fast)){
                tmp = first;
                continue;
            }
            if(tmp != null){
                tmp = tmp.next;
                if (slow.equals(tmp)){
                    break;
                }
            }
        }
        return tmp;
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
