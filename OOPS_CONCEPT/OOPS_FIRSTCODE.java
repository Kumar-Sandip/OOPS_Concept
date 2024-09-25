package OOPS_CONCEPT;

public class OOPS_FIRSTCODE {
    public static void main(String[] args) {
        pen p1 = new pen(); // create a pen object and called p1
        p1.setSetcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setSetcolor("Yellow");
        System.out.println(p1.color);
BankAccount   myAcc = new BankAccount();
myAcc.Username = "Sandipkumar";
myAcc.setPasword(" abcdefgi");


    }

}
class BankAccount{
    public String Username;
    private String Pasword;
    public void setPasword(String pwd){
        Pasword= pwd;
    }
}
class pen {
    String color;
    int tip;
    void setSetcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;

    }
    class Student{
        String name ;
        int age;
        float percentage;// or calculate cgpa
        void calcperceentage(int phy ,int chi, int math , int English, int Hindi){
            percentage =(phy+chi+math+English+Hindi)/3;

        }

    }
}

