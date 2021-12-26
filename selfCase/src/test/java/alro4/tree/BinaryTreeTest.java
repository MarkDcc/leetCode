package alro4.tree;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/1/5
 * @Time 21:16
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
//        //�����������������
//        BinaryTree<Integer, String> tree = new BinaryTree<>();
//
//        //���Բ���
//        tree.put(1,"����");
//        tree.put(2,"����");
//        tree.put(3,"����");
//        System.out.println("������Ϻ�Ԫ�صĸ�����"+tree.size());
//
//        //���Ի�ȡ
//        System.out.println("��2��Ӧ��Ԫ���ǣ�"+tree.get(2));
//
//        //����ɾ��
//
//        tree.delete(3);
//        System.out.println("ɾ�����Ԫ�ظ�����"+tree.size());
//        System.out.println("ɾ�����3��Ӧ��Ԫ��:"+tree.get(3));


        //����������
        BinaryTree<String, String> tree = new BinaryTree<>();
        //�������������
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //����������Сkey
//        System.out.println(tree.min());
//        System.out.println(tree.max());
//        //����ǰ�����
//        Queue<String> keys = tree.preErgodic();
//        for (String key : keys) {
//            String value = tree.get(key);
//            System.out.println(key+"----"+value);
//        }
        //����������
        System.out.println(tree.maxDepth());

        Queue<String> keys = tree.layerErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }
    }
}
