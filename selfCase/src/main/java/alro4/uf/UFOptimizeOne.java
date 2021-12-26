package alro4.uf;

/**
 * @author dongchen
 * @Data 2021/1/19
 * @Time 18:18
 */
public class UFOptimizeOne {
    private int count;
    private int maxItem;
    private int[] eleAndGroup;

    public UFOptimizeOne(int N) {
        count = N;
       // maxItem = N;
        eleAndGroup = new int[N];
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
//        if(p >= maxItem ){
//            return -1;
//        }
        while (true){
            if(p == eleAndGroup[p]){
                return p;
            }
            p = eleAndGroup[p];
        }
    }

    public void union(int p, int q) {
        int pIndex = find(p);
        int qIndex = find(q);
        if(pIndex == qIndex){
            return;
        }
        pIndex = qIndex;
        count --;
    }
}
