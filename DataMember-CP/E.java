package p2;

import p1.p11.B;

public class E extends B {

    public void methodE() {
        System.out.println("Method E from class E where package is p2");
    }

    // same Package(p2) another class(E and B)
    public void specifire() {
        C obj = new C();
        // since var b is private in C class cannt access
        // System.out.println("private " + obj.b);
        System.out.println("protected " + obj.c);
        System.out.println("Default " + obj.a);
        System.out.println("public " + obj.d);
    }

    // other package (p1) sub class (p1.p11.B <- E)
    public void oPsC() {
        // since var b and a are private and protected
        // in B class we cannt access
        // System.out.println("private " + b);
        System.out.println("protected " + c);
        // System.out.println("Default " + a);
        System.out.println("public " + d);
    }

    public static void main(String[] args) {

        E e = new E();
        e.methodA();
        e.methodB();
        e.methodE();
    }
}
