package alro4.list;

/**
 * @author dongchen
 * @Data 2020/12/30
 * @Time 20:02
 */
public class LinkListTest {
    public static void main(String[] args) {

        //����˳������
        LinkList<String> sl = new LinkList<>();
        //���Բ���
        sl.insert("Ҧ��");
        sl.insert("�Ʊ�");
        sl.insert("���");
        sl.insert(1,"ղķ˹");

        for (String s : sl) {
            System.out.println(s);
        }

        System.out.println("------------------------------------------");

//        //���Ի�ȡ
//        String getResult = sl.get(1);
//        System.out.println("��ȡ����1���Ľ��Ϊ��"+getResult);
//        //����ɾ��
//        String removeResult = sl.remove(0);
//        System.out.println("ɾ����Ԫ���ǣ�"+removeResult);
//        //�������
//        sl.clear();
//        System.out.println("��պ�����Ա��е�Ԫ�ظ���Ϊ:"+sl.length());

        //���Է�ת
        sl.reverse();
        for (String s : sl) {
            System.out.println(s);
        }
    }
}
