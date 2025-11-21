package AbstractClassStudy;

public  class Abstactclass  extends  A{

    public static void main(String[] args) {
        Abstactclass a = new Abstactclass();
        a.AB();
        a.BC();
    }

    @Override
    public void AB() {
        System.out.println(" i am abstact class of ab");
    }

    @Override
    public void BC() {
        System.out.println(" i am abstact bc");
    }
}
