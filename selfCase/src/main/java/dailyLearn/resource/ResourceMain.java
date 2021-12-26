package dailyLearn.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dongchen
 * @Data 2020/11/12
 * @Time 10:22
 */
public class ResourceMain {
    public static void main(String[] args) throws IOException {
      Resource resource = new ClassPathResource("text.txt");
      String result = FileCopyUtils.copyToString(new InputStreamReader(resource.getInputStream(),"UTF-8"));
        System.out.println(result);

    }
}
