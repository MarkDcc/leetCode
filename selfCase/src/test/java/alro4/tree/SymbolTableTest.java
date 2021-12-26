package alro4.tree;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 20:11
 */
public class SymbolTableTest {
    public static void main(String[] args) {
        //�������ű����
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        //����put����������,�滻��
        symbolTable.put(1,"�Ƿ�");
        symbolTable.put(2,"����");
        symbolTable.put(3,"����");

        System.out.println("������Ϻ�Ԫ�صĸ���Ϊ:"+symbolTable.size());

        symbolTable.put(2, "Ľ�ݸ�");
        System.out.println("�滻��Ϻ��Ԫ�صĸ���Ϊ:"+symbolTable.size());

        //����get����
        System.out.println("�滻��Ϻ󣬼�2��Ӧ��ֵΪ:"+symbolTable.get(2));

        //����ɾ������
        symbolTable.delete(2);
        System.out.println("ɾ����Ϻ�Ԫ�صĸ���:"+symbolTable.size());
        System.out.println("ɾ����Ϻ󣬼�2��Ӧ��ֵΪ:"+symbolTable.get(3));
    }
}
