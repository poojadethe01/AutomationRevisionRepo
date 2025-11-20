package method;

public class B {
    public static void main(String[] args) {
        A a = new A ();
        a.g();
        a.f();

        B b = new B ();
        b.AA();
    }
    public void AA()
    {
        System.out.println("i am B method & void ");
    }
}
