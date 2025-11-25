package LogicalQuestion;

public class Revser {
    public static void main(String[] args) {

        String name = "reactions";
        String reve = "";

        for (int i= name.length()-1; i>=0;i--)
        {
          char  demo=name.charAt(i);
          reve = reve + demo;
        }
        System.out.println(reve);
    }
}
