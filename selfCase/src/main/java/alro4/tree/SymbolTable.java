package alro4.tree;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 18:53
 */
public class SymbolTable<Key, Value> {
    private Node head;
    private int N;

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public Value get(Key key) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.key.equals(key)) {
                return n.value;
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        Node newNode = new Node(key, value, null);
        Node n = head;

        while (n.next != null) {
            n = n.next;
            if(n.key.equals(key)){
                n.value = value;
                return;
            }
        }
        N++;
        Node oldFirst = head.next;
        head.next = newNode;
        newNode.next = oldFirst;

    }

    public void delete(Key key) {
        N--;
        Node n = head;
//        Node pre;
        while (n.next !=null){
            Node pre = n;
            n = n.next;
            if(n.key.equals(key)){
                pre.next = n.next;
                return;
            }
        }
    }

    public int size() {
        return N;
    }


    private class Node {
        public Key key;
        public Value value;
        public Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
