package OOPSPrinciple;

public class B extends InheritanceSingle {
    public static void main(String[] args) {
        B b = new B ();
        b.test();
        b.Demo();
        b.DemoOne();

    }
    public void Demo()
    {
        System.out.println(" i am B method of singleLevel");
    }
    public void DemoOne ()
    {
        System.out.println("I am demoone method of singlelevel");
    }
}
