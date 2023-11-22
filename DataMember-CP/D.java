package p2.p21;

public class D {
    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void methodD() {
        System.out.println("Method D from package p2.21");
    }

    // same class access specifire
    public void prntVar() {
        System.out.println("private " + b);
        System.out.println("protected " + c);
        System.out.println("Default " + a);
        System.out.println("public " + d);
    }

}
