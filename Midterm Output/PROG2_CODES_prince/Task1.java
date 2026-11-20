import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int[][][] three = {{{100,200},{300,400}},{{70,80},{90,10}}};

        for (int l = 0; l < three.length;l++) {
            System.out.println("Layers["+l+"]: " + (l+1));
            for (int r = 0;r < three[l].length;r++) {
                for (int c=0;c<three[l][r].length;c++) {
                    System.out.println("threeDim ["+r+"]["+c+"]: " + three[l][r][c]);
                    System.out.printf("");
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        do {
        int[][][] threeDim = new int[2][2][2];
        int total = 0;
        int count = 0;

        System.out.println("Enter the value: ");

        for (int lay = 0;lay<2;++lay) {
            System.out.println("Layer ["+lay+"]: " + (lay + 1));
            for (int row = 0;row<2;++row) {
                for (int col = 0;col<2;++col) {
                    System.out.print("Elements ["+row+"]["+col+"]:" );
                    threeDim[lay][row][col] = sc.nextInt();

                    ++count;
                    total = total + threeDim[lay][row][col];
                }

            }
        }

        for (int lay = 0;lay<2;++lay) {
            System.out.println("Layer ["+lay+"]: ");
            for (int row = 0;row<2;++row) {
                for (int col = 0;col<2;++col) {
                    System.out.println("threeDim ["+row+"]["+col+"]: " + threeDim[lay][row][col]);
                    System.out.printf("");

                }
            }
        }
        
        System.out.println("ARRAY HAS " + count + " NUMBER OF ELEMENTS");
        System.out.println("The total..... " + total);

        System.out.println("DO YOU WANT TO TRY AGAIN? [Y/N]");
        } while (sc.next().equalsIgnoreCase("y"));



        sc.close();
    }
}
