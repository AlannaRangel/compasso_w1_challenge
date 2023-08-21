import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int instanceNumber = 1;

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            scanner.nextLine();

            String worstStudentName = "";
            int minProblemsSolved = Integer.MAX_VALUE; // Stores the minimum number of solved problems.

            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int problemsSolved = scanner.nextInt();
                scanner.nextLine();

                if (problemsSolved < minProblemsSolved) {
                    minProblemsSolved = problemsSolved; // Updates the least resolved issues.
                    worstStudentName = name;
                }
            }

            System.out.println("Instancia " + instanceNumber);
            System.out.println(worstStudentName + "\n"); // Prints the number of students with fewer problems sorved.

            instanceNumber++;
        }
    }
}
