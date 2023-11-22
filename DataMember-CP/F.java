package p2;

// import p2.C;

public class F extends C {
    // same package(p2) sub class (C <- F )

    public void specifire() {
        // since var b is private in C class cannt access
        // System.out.println("private " + b);
        System.out.println("protected " + c);
        System.out.println("Default " + a);
        System.out.println("public " + d);
    }
}
