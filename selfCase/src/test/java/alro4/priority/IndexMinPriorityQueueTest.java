package alro4.priority;

/**
 * @author dongchen
 * @Data 2021/1/14
 * @Time 22:21
 */
public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        //����������С���ȶ��ж���
        IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<>(10);

        //�����������Ԫ��
        queue.insert(0,"A");
        queue.insert(1,"C");
        queue.insert(2,"F");

        //�����޸�
        queue.changeItem(2,"B");

        //����ɾ��
        while(!queue.isEmpty()){
            int index = queue.delMin();
            System.out.print(index+" ");
        }


    }
}
