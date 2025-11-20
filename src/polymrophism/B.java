package polymrophism;

public class B extends  methodovverrding{
    public static void main(String[] args) {
        B b = new B ();
        b.A();
        b.B();

        methodovverrding m = new methodovverrding ();
        m.A();
        m.B();

    }

    public void A ()
    {
        System.out.println("i am B class  methodovverrding");
    }
    public void B ()
    {
        System.out.println(" i am B class method");
    }
}
