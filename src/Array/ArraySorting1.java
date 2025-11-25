package Array;

import java.util.Arrays;

public class ArraySorting1 {
    public static void main(String[] args) {
        int [] ar = new int [4];

        ar[0]=45;
        ar[1]=89;
        ar[2]=99;
        ar[3]=77;
        Arrays.sort(ar);

        System.out.println("..Sorting array...");
        for(int i=0;i<=ar.length-1;i++ )
        {
            System.out.println(ar[i]);
        }
    }
}
