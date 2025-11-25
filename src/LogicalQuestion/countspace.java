package LogicalQuestion;

public class countspace {
    public static void main(String[] args) {
        String s = "ve lo ci ty ";
        int count =0;
        int space =' ';
        for (int i=0;i<=s.length()-1;i++)
        {
            if(space==s.charAt(i))
            {
                count++;
            }




        }
        System.out.println(count);
    }
}
