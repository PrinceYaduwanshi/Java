public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student(); // if no constructor exists then crates a new one on own..if any exists then searches for it
        // if structure is not present then error
        s1.name = "Prince Raj";
        s1.roll = 20;
        s1.password = "abx@123";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz@123";
        System.out.println(s2.password);
        s1.marks[2] = 100; //pass by reference for array.thus chnages made in marks in object s1 reflect in s2;
        for(int i = 0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println("S1 marks:" +s1.marks[2]);
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0 ; i<marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
        
    }

    Student(){
        marks = new int[3];
        System.out.println("Consructor is called");
    }

    // generally constructors have same name to that of objects
    Student(String name){//parameterized  constructor
        marks = new int[3];
        this.name = name;//constructor with initialization
        
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
        
    }
    
}