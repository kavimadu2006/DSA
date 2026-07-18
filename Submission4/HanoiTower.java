import java.util.Scanner;

public class HanoiTower {

    // Recursive method to solve Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = input.nextInt();

        System.out.println("\nSteps to solve Tower of Hanoi:\n");

        towerOfHanoi(n, 'A', 'B', 'C');

        input.close();
    }
}
