package Array;

public class printarrayReveseorder {
    public static void main(String[] args) {
        int  [] ar =  new int [4];

        ar[0]=90;
        ar[1]=88;
        ar[2]=55;
        ar[3]=44;

        System.out.println(ar[3]);
        System.out.println("..printing Reverse String..");

        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }

    }
}
