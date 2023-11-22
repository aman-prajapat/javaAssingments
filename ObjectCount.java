import java.util.Scanner;

class Emp {
    static int count = 0;

    Emp() {
        count++;
    }
}

public class ObjectCount {

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);

        do {
            new Emp();
            System.out.println("Enter 1 to create a new object and 0 to exit");
            count = sc.nextInt();

        } while (count > 0);
        sc.close();
        System.out.println("Total objects created " + Emp.count);
    }
}
