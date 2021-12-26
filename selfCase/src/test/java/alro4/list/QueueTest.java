package alro4.list;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 11:02
 */
public class QueueTest {
    public static void main(String[] args) {

        //�������ж���
        Queue<String> q = new Queue<>();

        //���Զ��е�enqueue����
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");
        q.enqueue("e");

        for (String str : q) {
            System.out.println(str);
        }

        System.out.println("-------------------------------");
        //���Զ��е�dequeue����
        String result = q.dequeue();
        System.out.println("�����е�Ԫ���ǣ�"+result);
        System.out.println("ʣ���Ԫ�ظ�����"+q.size());
    }
}
