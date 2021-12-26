package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/1
 * @Time 18:07
 */
public class Main3 {
    public static void main(String[] args) {
        String project = "Pen";
        project.toLowerCase();
        project = project.concat("BOX".toLowerCase());
        System.out.println(project);
        System.out.println(project.substring(4,6));
    }
}
