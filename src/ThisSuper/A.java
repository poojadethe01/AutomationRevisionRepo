package ThisSuper;

public class A {
    int a =77;
    int b =80;
    public static void main(String[] args) {
        A a = new A ();
        a.AB();
        a.BC();
    }
    public void AB ()
    {
        System.out.println(this.a);
    }
    public void BC ()
    {
        System.out.println(this.b);
    }
}
