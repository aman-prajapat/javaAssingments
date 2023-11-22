package p1;

import p2.C;

public class A {

    // same Package(p2) another class(E and B)
    public void specifire() {
        C obj = new C();
        // since var b,c,a are private,protected and default
        // in C class we cannt access
        // System.out.println("private " + obj.b);
        // System.out.println("protected " + obj.c);
        // System.out.println("Default " + obj.a);
        System.out.println("public " + obj.d);
    }

    public void methodA() {
        System.out.println("Running class A from Package p1");
    }
}
