package alro4.list;

import dailyLearn.test.Test;

/**
 * @author dongchen
 * @Data 2021/1/1
 * @Time 19:09
 */
public class Joseph {
    public static void main(String[] args) {

        Node<Integer> first = null;
        Node<Integer> curr = null;


        //构建约瑟夫环
        for (int i = 1; i <= 41; i++) {
            //当为1时候
            if (i == 1) {
                first = new Node<Integer>(1, null);
                curr = first;
                continue;
            }

            //不是1的时候
            Node newNode = new Node(i, null);
            //让当前node的next指向新node
            curr.next = newNode;
            //让当前节点下移一个
            curr = newNode;

            //到了41
            if (i == 41) {
                curr.next = first;
            }

        }
        Node<Integer> before = null;
        Node<Integer> tmp = first;
        int count = 0;

        while (tmp != tmp.next) {

            count++;
            if(count == 3){
                System.out.print(tmp.item+",");
                count = 0;
                //删除count=3的节点，让count=3的前一位指向count=3的下一位
                before.next=tmp.next;
                tmp = tmp.next;
            }else {
                //找到count=3的前一位
                before = tmp;
                tmp = tmp.next;
            }

        }
        System.out.print(tmp.item);


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
