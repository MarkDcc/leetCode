package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/8
 * @Time 9:56
 */

    class MissingInfoException extends Exception {

    }
    class AgeOutofRangeException extends Exception {
    }
    class Candidate {
        String name;
        int age;
        Candidate(String name, int age ) throws Exception {
            if (name == null) {
                throw new MissingInfoException();
            }	else if (age <= 10 || age >= 150) {
                throw new AgeOutofRangeException();
            }	else {
                this.name = name;
                this.age = age;
            }
        }
        @Override
        public String toString() {
            return name + " age: " + age;
        }


}
