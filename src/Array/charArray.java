package Array;

public class charArray {
    public static void main(String[] args) {

        char []ar = new char[4];

        ar[0]='A';    //index 0 to 3
        ar[1]='B';
        ar[2]='C';
        ar[3]='D';

        System.out.println(ar.length);     //4
        System.out.println("...printing all char in arrya....");

        for(int i=0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }


    }
}
