package p1.p11;

import p1.A;

public class B extends A {

    public void methodB() {
        System.out.println("Method B from class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodB();
    }
}
