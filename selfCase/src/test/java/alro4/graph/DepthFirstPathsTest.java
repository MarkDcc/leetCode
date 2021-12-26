package alro4.graph;

import alro4.list.Stack;

import java.io.*;

/**
 * @author dongchen
 * @Data 2021/2/12
 * @Time 17:38
 */
public class DepthFirstPathsTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Myfile\\git-hub\\self" +
                "-code\\leetCode\\selfCase\\src\\test\\java\\alro4\\graph\\road_find.txt")));


        //读取第一行数据6
        int total = Integer.parseInt(br.readLine());
        //根据第一行数据构建一副图Graph
        Graph G = new Graph(total);
        //读取第二行数据8
        int edgeNumbers = Integer.parseInt(br.readLine());
        //继续通过循环读取每一条边关联的两个顶点，调用addEdge方法，添加边
        for (int i = 1;i<=edgeNumbers;i++){
            String edge = br.readLine();//0 1
            String[] str = edge.split(" ");
            int v = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            G.addEdge(v,w);
        }

        //构建路径查找对象，并设置起点为0
        DepthFirstPaths paths = new DepthFirstPaths(G, 0);
        //调用 pathTo(4)，找到从起点0到终点4的路径，返回Stack
        Stack<Integer> path = paths.pathTo(4);
        StringBuilder sb = new StringBuilder();
        //遍历栈对象
        for (Integer v : path) {
            sb.append(v+"-");
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);
    }
    }

