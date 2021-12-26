package alro4.tree;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/1/5
 * @Time 21:16
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
//        //创建二叉查找树对象
//        BinaryTree<Integer, String> tree = new BinaryTree<>();
//
//        //测试插入
//        tree.put(1,"张三");
//        tree.put(2,"李四");
//        tree.put(3,"王五");
//        System.out.println("插入完毕后元素的个数："+tree.size());
//
//        //测试获取
//        System.out.println("键2对应的元素是："+tree.get(2));
//
//        //测试删除
//
//        tree.delete(3);
//        System.out.println("删除后的元素个数："+tree.size());
//        System.out.println("删除后键3对应的元素:"+tree.get(3));


        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //测试最大和最小key
//        System.out.println(tree.min());
//        System.out.println(tree.max());
//        //测试前序遍历
//        Queue<String> keys = tree.preErgodic();
//        for (String key : keys) {
//            String value = tree.get(key);
//            System.out.println(key+"----"+value);
//        }
        //测试最大深度
        System.out.println(tree.maxDepth());

        Queue<String> keys = tree.layerErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }
    }
}
