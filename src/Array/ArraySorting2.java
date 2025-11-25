package Array;

import java.util.Arrays;

public class ArraySorting2 {
    public static void main(String[] args) {
        String []s = new String [4];

        s[0]="bghavesh";
        s[1]="rrrrrttt";
        s[2]="pooooo";
        s[3]="oooooppp";
        Arrays.sort(s);

        for(int i=0;i<=s.length-1;i++)
        {
            System.out.println(s[i]);
        }

        System.out.println("..After Sorting..");
        for(int i=0;i<=s.length-1;i++)
        {
            System.out.println(s[i]);
        }
    }
}
