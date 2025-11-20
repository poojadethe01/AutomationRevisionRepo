package polymrophism;

public class methodoverloding {
    public static void main(String[] args) {
        methodoverloding m = new methodoverloding() ;
        m.A();
        m.A(90);
        m.A(90,90);
    }
    public void A ()
    {
        System.out.println("i am A method without parameter");
    }
    public void A (int a )
    {
        System.out.println("i am single parameter");
    }
    public void A (int a, int b)
    {
        System.out.println("i am two parameter");
    }
}
