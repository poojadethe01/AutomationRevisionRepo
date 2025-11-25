package LogicalQuestion;

public class Revese {
    public static void main(String[] args) {
        String name = "Engineering";
        String reve ="";

        for(int i=name.length()-1;i>=0;i--)
        {
            char demo = name.charAt(i);
            reve=reve+demo;


        }System.out.println(reve);
    }
}
