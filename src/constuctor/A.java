package constuctor;

public class A {
    public static void main(String[] args) {
        A a = new A ();
        A b = new A(90,70);
        A c = new A (45,90.0f);

    }
    public A()
    {
        System.out.println("Zero parameter construtor");
    }
    public A(int a,int b){
        System.out.println(a*b);
    }
    public A (int c ,float d)
    {
        System.out.println(c/d);
    }
}
