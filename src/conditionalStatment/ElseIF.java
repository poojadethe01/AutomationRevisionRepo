package conditionalStatment;

public class ElseIF {
    public static void main(String[] args) {
        int marks =90;
        if(marks==80)
        {
            System.out.println("Distction");
        } else if (marks<=59& marks>=60) {
            System.out.println("Then first class");

        } else if (marks<=49& marks >=55) {
            System.out.println("Then second class");
        } else if (marks<=35) {
            System.out.println("Then fail");
        }
        else
        {
            System.out.println("entre correct marks");
        }
    }
}
