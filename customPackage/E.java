package p2;

import p1.p11.B;

public class E extends B {

    public void methodE() {
        System.out.println("Method E from class E where package is p2");
    }

    public static void main(String[] args) {

        E e = new E();
        e.methodA();
        e.methodB();
        e.methodE();
    }
}
