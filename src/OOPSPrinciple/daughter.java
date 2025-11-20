package OOPSPrinciple;

public class daughter  extends mother{
    public static void main(String[] args) {
        daughter d = new daughter();
        d.pen();
        d.scooty();
        d.home();
        d.look();
    }
    public void scooty()
    {
        System.out.println("daughter scooty");
    }
    public void pen()
    {
        System.out.println("daughter pen");
    }
}
