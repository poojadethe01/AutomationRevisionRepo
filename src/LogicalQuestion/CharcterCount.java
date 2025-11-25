package LogicalQuestion;

public class CharcterCount {
    public static void main(String[] args) {
        String s = "elphistionnnnn";
        int count = 0;
        int space ='n';

        for(int i=0;i<=s.length()-1;i++)
        {
            if(space==s.charAt(i))
            {
               count++;
            }
        } System.out.println(count);
    }
}
