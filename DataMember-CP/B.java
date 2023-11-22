package p1.p11;

import p1.A;

public class B extends A {
    int a = 10;
    // private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void methodB() {
        System.out.println("Method B from class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodB();
    }
}
