import java.util.Scanner;

class Pnr {
    long pnr = 1000000000l;
    String Passenger_name;
    int train;
    int bogie;
    int seat;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        Passenger_name = sc.nextLine();
        System.out.println("Choose Train from (1,2,3) ");
        train = sc.nextInt() - 1;
        System.out.println("Choose bogie from (1 to 8) ");

    }
}

public class Train {
    static int[][] train = new int[3][8];

    public static void main(String[] args) {

    }

}
