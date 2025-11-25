package LogicalQuestion;

public class Count {
    public static void main(String[] args) {

        String name =" po ojar ajua mbekar";
        int count = 0;
        int  space =' ';
        for(int i=0;i<=name.length()-1;i++)
        {
           if(space==name.charAt(i))
           {
               count++;
           }
        }
        System.out.println(count);
    }
}
