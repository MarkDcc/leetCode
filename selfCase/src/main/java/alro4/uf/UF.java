package alro4.uf;

/**
 * @author dongchen
 * @Data 2021/1/19
 * @Time 17:34
 */
public class UF {
    private int count;
    private int maxItem;
    private int[] eleAndGroup;

    public UF(int N) {
        count = N;
        maxItem = N;
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
        return eleAndGroup[p];
    }

    public void union(int p, int q) {
        int pIndex = find(p);
        int qIndex = find(q);
        if(pIndex == qIndex){
            return;
        }
        for (int i = 0; i < eleAndGroup.length; i++) {
            if(eleAndGroup[i] == pIndex){
                eleAndGroup[i] = qIndex;
            }
        }
        count --;
    }
}
