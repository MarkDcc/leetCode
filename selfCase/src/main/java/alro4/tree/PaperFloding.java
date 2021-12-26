package alro4.tree;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/1/6
 * @Time 21:28
 */
public class PaperFloding {
    public static void main(String[] args) {
        Node tree = creatTree(3);
        printTree(tree);
    }

    private static Node creatTree(int N){
        Node root = null;

        for (int i = 0; i < N; i++) {
            if(i==0){
                root = new Node("down",null,null);
               continue;
            }
           //²ãÐò±éÀú
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            while (!queue.isEmpty()){
                Node n = queue.dequeue();
                if(n.left != null){
                    queue.enqueue(n.left);
                }
                if(n.right != null){
                    queue.enqueue(n.right);
                }

                if(n.left == null && n.right == null){
                    n.left = new Node("down",null,null);
                    n.right = new Node("up",null,null);
                }
            }
        }

        return root;
    }

    private static void printTree(Node tree){

        if(tree == null){
            return;
        }

        printTree(tree.left);
        System.out.print(tree.item+",");
        printTree(tree.right);
    }

    private static class Node{
        private String item;
        private Node left;
        private Node right;

        public Node(String item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }
}
