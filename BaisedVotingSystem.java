import java.util.Scanner;

public class BaisedVotingSystem {
    static int A = 0;
    static int B = 0;
    static int C = 0;
    static int D = 0;
    static int count = 0;

    void voteCaste() {
        Scanner in = new Scanner(System.in);
        count++;
        while (true) {
            System.out.println("1 for A \n2 for B \n3 for C \n4 for D");
            int var = in.nextInt();
            if (count % 3 == 0 || count % 7 == 0 || var == 3) {
                C = C + 1;
                break;
            } else if (var == 1) {
                A += 1;
                break;
            } else if (var == 2) {
                B += 1;
                break;

            } else if (var == 4) {
                D += 1;
                break;
            } else {
                System.out.println("Choose a vaild option");
            }
        }

        System.out.println(A + B + C + D);
    }

    void ComprehensiveResults() {
        System.out.println("A : " + A);
        System.out.println("B : " + B);
        System.out.println("C : " + C);
        System.out.println("D : " + D);

    }

    void CandidateWise() {
        Scanner in = new Scanner(System.in);
        int var;
        while (true) {
            System.out.println("Whom Result you want to see?\n1 for A \n2 for B \n3 for C \n4 for D");
            var = in.nextInt();
            if (var <= 4 || var >= 1) {
                break;
            }
        }

        in.close();
        switch (var) {
            case 1:
                System.out.println("A : " + A);
                break;
            case 2:
                System.out.println("B : " + B);
                break;
            case 3:
                System.out.println("C : " + C);
                break;
            case 4:
                System.out.println("D : " + D);
                break;

            default:
                System.out.println("Choose a vaild option");

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            BaisedVotingSystem test = new BaisedVotingSystem();
            System.out.println("Choose your option...");
            System.out.println("1 to Vote Caste");
            System.out.println("2 for Comprehensive results");
            System.out.println("3 for Candidate wise results");
            System.out.println("4 to Exit");

            int choise = input.nextInt();

            switch (choise) {
                case 1:
                    test.voteCaste();
                    break;
                case 2:
                    test.ComprehensiveResults();
                    break;
                case 3:
                    test.CandidateWise();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter a vaild option");

            }
        }

    }
}