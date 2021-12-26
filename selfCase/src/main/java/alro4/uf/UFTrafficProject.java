package alro4.uf;

import java.io.*;

/**
 * @author dongchen
 * @Data 2021/1/20
 * @Time 14:03
 */
public class UFTrafficProject {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Myfile\\git-hub\\self-code\\leetCode" +
                "\\selfCase\\src\\main\\resources\\traffice.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        int number = Integer.valueOf(br.readLine());
        int roadNumber = Integer.valueOf(br.readLine());
        UF_Tree_Weighted uf_tree_weighted = new UF_Tree_Weighted(number);
        for (int i = 0; i < roadNumber; i++) {
            String road = br.readLine();
            String[] roadA = road.split(" ");
            uf_tree_weighted.union(Integer.parseInt(roadA[0]),Integer.parseInt(roadA[1]));
        }
        System.out.println( uf_tree_weighted.count() -1 );


    }
}
