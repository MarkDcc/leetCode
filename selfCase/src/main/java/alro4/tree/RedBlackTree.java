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
        //��ǰ�ڵ�����ӽڵ�x
        Node x = h.right;
        //��x�����ӽڵ��Ϊh���ӽڵ�
        h.right = x.left;
        //��h��Ϊx�ڵ�����ӽڵ�
        x.left = h;
        //��X�ڵ��color���h�ڵ��color
        x.color = h.color;
        //��h�ڵ��color���red
        h.color = RED;

        return x;
    }
    private Node rotateRight(Node h){
        //��ǰ�ڵ�����ӽڵ�
        Node x = h.left;

        //x�����ӽ���Ϊh�����ӽ��
        h.left = x.right;
        //��h��Ϊx�����ӽ��
        x.right = h;
        //��x��color��Ϊh��color����ֵ
        x.color = h.color;
        //��h��colorΪRED
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
