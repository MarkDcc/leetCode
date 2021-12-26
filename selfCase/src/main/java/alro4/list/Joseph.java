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


        //����Լɪ��
        for (int i = 1; i <= 41; i++) {
            //��Ϊ1ʱ��
            if (i == 1) {
                first = new Node<Integer>(1, null);
                curr = first;
                continue;
            }

            //����1��ʱ��
            Node newNode = new Node(i, null);
            //�õ�ǰnode��nextָ����node
            curr.next = newNode;
            //�õ�ǰ�ڵ�����һ��
            curr = newNode;

            //����41
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
                //ɾ��count=3�Ľڵ㣬��count=3��ǰһλָ��count=3����һλ
                before.next=tmp.next;
                tmp = tmp.next;
            }else {
                //�ҵ�count=3��ǰһλ
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
