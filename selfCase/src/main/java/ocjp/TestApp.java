package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/9
 * @Time 10:46
 */
import java.io.IOError;
public class TestApp{
    public void doList () throws Exception 	{
        throw new Error ("Error");
    }
    public void doPrint () throws Exception	{
        throw new RuntimeException("Exception");
    }
    public static void main(String[] args)	{
        TestApp t = new TestApp();
        try		{
            t.doPrint();
            t.doList();
        }
        catch (Exception e2)		{
            System.out.println("Caught " + e2);
        }
    }
}

