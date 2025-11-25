package LogicalQuestion;

public class CharCount {
    public static void main(String[] args) {
        String s = "bbennemmeeooepp";
        int count =0;
        int sapce ='e';

        for(int i=0;i<=s.length()-1;i++)
        {
            if(sapce==s.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
