package ThisSuper;

public class B extends A
{
    public static void main(String[] args) {
       B b = new B () ;
       b.s();
       b.d();
    }
    public void s()
    {
        System.out.println(super.a);
    }
    public void d ()
    {
        System.out.println(super.b);
    }
}
