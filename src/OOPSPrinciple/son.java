package OOPSPrinciple;

public class son extends mother{
    public static void main(String[] args) {
        son s =new son ();
        s.home();
        s.bullet();
        s.look();
        s.watch();

    }
    public void bullet()
    {
        System.out.println("sons bullet");
    }
    public void watch ()
    {
        System.out.println("sons watch");
    }
}
