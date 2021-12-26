package alro4.uf;

/**
 * @author dongchen
 * @Data 2021/1/20
 * @Time 11:57
 */
public class UF_Tree_Weighted {
    private int count;
    private int maxItem;
    private int[] eleAndGroup;
    private int[] size;

    public UF_Tree_Weighted(int N) {
        count = N;
        // maxItem = N;
        eleAndGroup = new int[N];
        size = new int[N];
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }
        for (int i = 0; i < size.length; i++) {
            size[i] = 1;
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
        if(size[pIndex] < size[qIndex]){
            eleAndGroup[p] = qIndex;
            size[qIndex] += size[pIndex];
        }else  {
            eleAndGroup[q] = pIndex;
            size[pIndex] += size[qIndex];
        }
        count --;
    }
}
