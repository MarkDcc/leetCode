//package ocjp;
//
///**
// * @author dongchen
// * @Data 2020/9/2
// * @Time 9:54
// */
//
//    public class Person {
//        String name;
//        int age = 25;
//
//    public Person() {
//    }
//
//    public Person(String name) {
//            this();	//this 关键字放在构造函数中调用无参构造方法							//line n1
//            setName(name);
//        }
//        public Person(String name, int age) {
//            new Person(name);							//line n2
//            setAge(age);
//        }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    //setter and getter methods go here
//        public String show() {
//            return name + " " + age + " " + number;
//        }
//        public static void main(String[] args) {
//            Person p1 = new Person("Jesse");
//            Person p2 = new Person("Walter",52);
//            System.out.println(p1.show());
//            System.out.println(p2.show());
//        }
//    }
//
//
