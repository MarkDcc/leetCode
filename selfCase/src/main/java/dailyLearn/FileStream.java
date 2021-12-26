package dailyLearn;

import java.io.File;
import java.io.IOException;

/**
 * @author dongchen
 * @Data 2020/9/3
 * @Time 9:37
 */
public class FileStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Myfile\\git-hub\\self-code\\leetCode\\selfCase\\src\\main\\resources\\test","text.json");
        File file1 = new File("C:\\Myfile\\git-hub\\self-code\\leetCode\\selfCase\\src\\main\\resources\\test");
        if(!file1.exists()){
            file1.mkdirs();
        }
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
    }
}
