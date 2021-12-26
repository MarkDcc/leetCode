package alro4.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/29
 * @Time 21:24
 */
public class SequenceListTest {


    @Test
    public void test1(){
        SequenceList<String> sequenceList = new SequenceList<>(3);
        sequenceList.insert("zhangsan");
        sequenceList.insert("lisi");
        Assert.assertEquals(2,sequenceList.length());
        sequenceList.insert(1,"wangwu");
        for (int i = 0; i < sequenceList.length(); i++) {
            System.out.println(sequenceList.get(i));
        }
        sequenceList.insert("lisi2");
        System.out.println(sequenceList.length());

        String result = sequenceList.remove(0);
        System.out.println(result);
        System.out.println(sequenceList.indexOf("lisi"));

        for (String item : sequenceList) {
            System.out.println(item);
        }
    }
}
