import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do {
            int[][] matrix = new int[3][3];

        System.out.println("Enter the value: ");

        for (int row = 0;row<3;++row) {
            for (int col = 0;col<3;++col) {
                matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println("Here are the Numbers and required outputs:\n");
        System.out.printf("%48s%n", "Row Sum");

        for (int row = 0;row<3;++row) {
            int sumR = 0;
            System.out.printf("%16s", "");
            for (int col = 0;col<3;++col) {
                System.out.printf("%-8d", matrix[row][col]);
                sumR = sumR + matrix[row][col];
            }
            System.out.printf("%8d%n", sumR);
        }

        System.out.print("Column sum:\t");
        for (int col = 0;col<3;++col) {
            int sumC = 0;
            for (int row = 0;row<3;++row) {
                sumC = sumC + matrix[row][col];

            }
            System.out.printf("%-8d", sumC);

        }

        int dia1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int dia2 = matrix[0][2] + matrix[1][1] + matrix[2][0];

        System.out.printf("%n%nDiagonal sum1: \t%d%n", dia1);
        System.out.printf("Diagonal sum1: \t%d%n", dia2);

        System.out.println("DO YOU WANT TO TRY AGAIN? [Y/N]");
        

        } while (sc.next().equalsIgnoreCase("y"));



        sc.close();
    }
    
}
