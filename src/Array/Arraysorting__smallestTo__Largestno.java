package Array;

import java.util.Arrays;

public class Arraysorting__smallestTo__Largestno {

    public static void main(String[] args) {

          int ar [] = new int [4];

          ar[0]=40;   // index o to 3
          ar[1]=50;
          ar[2]=80;
          ar[3]=30;
        Arrays.sort(ar);
        System.out.println(ar[0]);//smallest num
        System.out.println(ar[ar.length-1]);//hight num
    }
}
