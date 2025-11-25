package Array;

public class Stringarry {
    public static void main(String[] args) {

        String [] s = new String[4];

        s[0]="elu";    ///index 0 to 3
        s[1]="ladu";
        s[2]="aish";
        s[3]="pooja";
        s[3]="raju";//replace

        System.out.println(s[3]);
        System.out.println("...priting string array...");

        for(int i=0;i<=s.length-1;i++)
        {
            System.out.println(s[i]);
        }

    }
}
