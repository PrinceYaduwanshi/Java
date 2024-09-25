public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Don Bosco Academy";

        Student s2 = new Student();
        System.err.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "St. Xavier's";
        System.out.println(s3.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}