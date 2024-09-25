public class ClassesObjects{
    public static void main(String args[]){
        // Create an object of the class
        Pen pen1 = new Pen(); //constructor creates a pen object named pen1
        pen1.setColor("Red");
        System.out.println(pen1.getColor());
        pen1.setTip(5);
        System.out.println(pen1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Prince Raj";
        myAcc.setPassword ("xyz@123");
        System.out.println(myAcc.getPass());


    }
}

// use of access specifier
class BankAccount{
    public String username;
    private String password;
    
    // GETTER
    String getPass(){
        return this.password;
    }
    // SETTER
    public void setPassword(String newPass){
        this.password = newPass;
    }
}

class Pen{
    private String color;
    int tip;


    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;

    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercent(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3.0f;
    }
}