package Array;

public class DeclerationInitilizationString
{
    public static void main(String[] args) {

        String[] name ={"pooja","elu","seema","asha"};

        System.out.println(name[3]);
        System.out.println(name.length);
        System.out.println("..priting all data..");
        for(int i=0;i<=name.length-1;i++)
        {
            System.out.print(name[i]+" ");
        }
    }
}
