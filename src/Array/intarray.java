package Array;

public class intarray {
    public static void main(String[] args) {
        int [] num = new int [5];

        num[0]=90;
        num[1]=88;
        num[2]=77;
        num[3]=55;
        num[4]=90;
       // num[5]=00;

        System.out.println(num[3]);
        System.out.println("...printing int array..");

        for(int i=0;i<=num.length-1;i++)
        {
            System.out.println(num[i]);
        }

    }
}
