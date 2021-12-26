package alro4.uf;

import java.util.Scanner;

/**
 * @author dongchen
 * @Data 2021/1/19
 * @Time 17:51
 */
public class UFTest {
    public static void main(String[] args) {

        //�������鼯����
        UF uf = new UF(5);
        System.out.println("Ĭ������£����鼯���У�"+uf.count()+"������");

        //�ӿ���̨¼������Ҫ�ϲ���Ԫ�أ�����union�����ϲ����۲�ϲ��󲢲鼯�еķ����Ƿ����
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("�������һ��Ҫ�ϲ���Ԫ�أ�");
            int p = sc.nextInt();
            System.out.println("������ڶ���Ҫ�ϲ���Ԫ�أ�");
            int q = sc.nextInt();

            //�ж�������Ԫ���Ƿ��Ѿ���ͬһ����
            if (uf.connected(p,q)){
                System.out.println(p+"Ԫ�غ�"+q+"Ԫ���Ѿ���ͬһ��������");
                continue;
            }

            uf.union(p,q);
            System.out.println("��ǰ���鼯�л��У�"+uf.count()+"������");

        }
    }
}
