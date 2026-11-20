import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 3D Array: [2 sections][3 students][3 subjects]
        int[][][] grades = new int[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};
 
        // 1. Input grades using nested for loops
        for (int i = 0; i < 2; i++) { // Sections
            System.out.println("Enter grades for SECTION " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) { // Students
                System.out.println("Student " + (j + 1));
                for (int k = 0; k < 3; k++) { // Subjects
                    System.out.print(subjects[k] + ": ");
                    grades[i][j][k] = sc.nextInt();
                }
            }
            System.out.println();
        }
 
        // 2. Display grades and calculate averages
        for (int i = 0; i < 2; i++) {
            System.out.println("SECTION " + (i + 1));
            System.out.println("------------------------------------");
            double secTotal = 0;
 
            for (int j = 0; j < 3; j++) {
                System.out.println("Student " + (j + 1));
                double stuTotal = 0;
 
                for (int k = 0; k < 3; k++) {
                    System.out.println(subjects[k] + ": " + grades[i][j][k]);
                    stuTotal += grades[i][j][k];
                }
 
                double stuAvg = stuTotal / 3.0;
                System.out.printf("Student Average: %.2f\n\n", stuAvg);
                secTotal += stuTotal;
            }
 
            double secAvg = secTotal / 9.0; // 3 students x 3 subjects = 9 grades
            System.out.printf("Section Average: %.2f\n\n", secAvg);
        }
 
        sc.close();
    }
}
