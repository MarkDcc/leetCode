package alro4.tree;

import jdk.nashorn.internal.ir.IfNode;

import javax.swing.*;

/**
 * @author dongchen
 * @Data 2021/1/17
 * @Time 20:38
 */
public class RedBlackTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public RedBlackTree() {
        this.root = null;
        this.N = 0;
    }

    public boolean isRed(Node x){
        if(x == null){
            return false;
        }
        return RED == x.color;
    }
    private Node rotateLeft(Node h){
        //当前节点的右子节点x
        Node x = h.right;
        //让x的左子节点成为h右子节点
        h.right = x.left;
        //让h成为x节点的左子节点
        x.left = h;
        //让X节点的color变成h节点的color
        x.color = h.color;
        //让h节点的color变成red
        h.color = RED;

        return x;
    }
    private Node rotateRight(Node h){
        //当前节点的左子节点
        Node x = h.left;

        //x的右子结点成为h的左子结点
        h.left = x.right;
        //让h成为x的右子结点
        x.right = h;
        //让x的color变为h的color属性值
        x.color = h.color;
        //让h的color为RED
        h.color = RED;
        return x;
    }
    private void flipColors(Node h){
        h.right.color = BLACK;
        h.left.color = BLACK;
        h.color = RED;
    }
    public void put(Key key,Value value){
        root = put(root,key,value);
        root.color = false;
    }
    private Node put(Node h,Key key,Value value){
        if(h == null){
            N++;
            return new Node(null,null,key,value,RED);
        }
        int cmp = key.compareTo(h.key);
        if(cmp<0){
            h.left = put(h.left,key,value);
        }else if(cmp > 0){
            h.right = put(h.right,key,value);
        }else {
            h.value = value;
        }

        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }

        if(isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
        }

        if (isRed(h.right) && isRed(h.left)){
            flipColors(h);
        }
        return h;

    }
    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        if(x == null){
            return  null;
        }
        int cmp = key.compareTo(x.key);
        if(cmp<0){
            return get(x.left,key);
        }else if(cmp > 0){
            return get(x.right,key);
        }else {
            return x.value;
        }
    }
    public int size(){
        return N;
    }

    private class Node{
        public Node left;
        public Node right;
        public Key key;
        public Value value;
        public boolean color;

        public Node(Node left, Node right, Key key, Value value, boolean color) {
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
            this.color = color;
        }
    }
}
