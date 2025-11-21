package casting;

public class B extends A{
    public static void main(String[] args) {
        B b = new B ();
        b.Home();
        b.mobile();
        b.car();
        b.son();

        A a = new B ();
        a.Home();
        a.mobile();

    }

    public void son ()
    {
        System.out.println("son : bike");
    }

    public void car ()
    {
        System.out.println("son : BMW");
    }
}
