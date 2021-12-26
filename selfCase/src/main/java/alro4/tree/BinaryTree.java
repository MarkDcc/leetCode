package alro4.tree;

import alro4.list.Queue;

import java.util.function.Predicate;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 20:53
 */
public class BinaryTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

//    public BinaryTree() {
//        this.root = new Node(null, null, null, null);
//        this.N = 0;
//    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        Node newNode = new Node(key, value, null, null);
        if (x == null) {
            N++;
            return newNode;
        }

        Integer cmp = key.compareTo(x.key);

        if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else {
            x.value = value;
        }
        return x;

    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        Integer cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return get(x.right, key);
        } else if (cmp < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        Integer cmp = key.compareTo(x.key);
        if (cmp > 0) {
            x.right = delete(x.right, key);
        } else if (cmp < 0) {
            x.left = delete(x.left, key);
        } else {
            N--;
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }
            //找到右子树中最小的节点
            Node minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            Node preMinNode = x.right;
            while (preMinNode.left != null) {
                if (preMinNode.left.left == null) {
                    preMinNode.left = null;
                } else {
                    preMinNode = preMinNode.left;
                }
            }

            minNode.right = x.right;
            minNode.left = x.left;
            x = minNode;

        }

        return x;

    }

    public int size() {
        return N;
    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left != null){
           return min(x.left);
        }else{
            return x;
        }
    }
    public Key max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x.right != null){
            return max(x.right);
        }else {
            return x;
        }
    }

    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root,keys);
        return keys;
    }

    private void preErgodic(Node x, Queue<Key> keys){
        if(x == null){
            return;
        }
        keys.enqueue(x.key);
        if(x.left != null){
            preErgodic(x.left,keys);
        }
        if(x.right != null){
            preErgodic(x.right,keys);
        }
    }

    public Queue<Key> midErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }

    private void midErgodic(Node x, Queue<Key> keys){
        if(x == null){
            return;
        }
        if(x.left != null){
            midErgodic(x.left,keys);
        }
        keys.enqueue(x.key);
        if(x.right != null){
            midErgodic(x.right,keys);
        }
    }

    public Queue<Key> postErgodic(){
        Queue<Key> keys = new Queue<>();
        postErgodic(root,keys);
        return keys;
    }

    private void postErgodic(Node x, Queue<Key> keys){
        if(x == null){
            return;
        }
        if(x.left != null){
            postErgodic(x.left,keys);
        }

        if(x.right != null){
            postErgodic(x.right,keys);
        }
        keys.enqueue(x.key);
    }

    public Queue<Key> layerErgodic(){
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);
        while (!nodes.isEmpty()){
            Node node = nodes.dequeue();
            keys.enqueue(node.key);
            if(node.left != null){
                nodes.enqueue(node.left);
            }
            if(node.right != null){
                nodes.enqueue(node.right);
            }
        }
        return keys;
    }

    public int maxDepth(){
        return maxDepth(root);
    }
    private int maxDepth(Node x){
        if(x == null){
            return 0;
        }
        int maxLeft = 0;
        int maxRight = 0;
        if(x.left != null){
            maxLeft = maxDepth(x.left);
        }
        if(x.right != null){
            maxRight = maxDepth(x.right);
        }
        return Math.max(maxLeft,maxRight)+1;
    }

    private class Node {
        public Key key;
        public Value value;
        Node right;
        Node left;

        public Node(Key key, Value value, Node right, Node left) {
            this.key = key;
            this.value = value;
            this.right = right;
            this.left = left;
        }
    }
}
