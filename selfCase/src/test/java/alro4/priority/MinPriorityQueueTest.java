package alro4.priority;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 22:05
 */
public class MinPriorityQueueTest {
    public static void main(String[] args) {
        //创建最小优先队列对象
        MinPriorityQueue<String> queue = new MinPriorityQueue<String>(10);
        //往队列中存数据
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");

        //通过循环获取最小优先队列中的元素
        while(!queue.isEmpty()){
            String min = queue.delMin();
            System.out.print(min+" ");
        }

    }
}
