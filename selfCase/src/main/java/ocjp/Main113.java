package ocjp;

import java.util.ArrayList;

/**
 * @author dongchen
 * @Data 2020/10/22
 * @Time 10:28
 */
public class Main113 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try	{
            while (true) {
                myList.add("My String");
            }
        }
        catch (RuntimeException re)	{
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e)	{
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");

    }
}
