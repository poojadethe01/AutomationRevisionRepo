package method;

public class A {
    public static void main(String[] args) {
        A a = new A ();
        a.g();
        a.f();
        h();
    }

    public void g()
    {
        System.out.println("i am g method running");
    }
    public void f ()
    {
        System.out.println("i am f method running");
    }
    public static void h ()
    {
        System.out.println("i am h method running");
    }
}
