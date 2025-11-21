package interfaceStudy;

public class B implements  A,D{
    public static void main(String[] args) {
        B b = new B ();
        b.AB();
        b.BC();
    }

    @Override
    public void AB() {
        System.out.println("This is interface class AB");
    }

    @Override
    public void BC() {
        System.out.println("This is interface calss BC");

    }

    @Override
    public void Bc() {
        System.out.println("hii");
    }

    @Override
    public void cc() {
        System.out.println("by");
    }
}
