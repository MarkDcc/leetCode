package alro4.priority;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 22:05
 */
public class MinPriorityQueueTest {
    public static void main(String[] args) {
        //������С���ȶ��ж���
        MinPriorityQueue<String> queue = new MinPriorityQueue<String>(10);
        //�������д�����
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");

        //ͨ��ѭ����ȡ��С���ȶ����е�Ԫ��
        while(!queue.isEmpty()){
            String min = queue.delMin();
            System.out.print(min+" ");
        }

    }
}
