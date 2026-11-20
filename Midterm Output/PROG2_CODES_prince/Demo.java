import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        // 1 dimensional array eclare and init
        int nums[] = new int[3];
        float grades[] = {90.00f, 95.00f, 65.00f};
        boolean choices[] = {true, false};
        //traverse the Array name Grades
        for(int ctr=0;ctr<grades.length;++ctr) {
            System.out.println("Grades["+ctr+"]: " + grades[ctr]);
        }
        //input grades using scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("type Grades:");
        for(int ctr=0;ctr<grades.length;++ctr) {
            grades[ctr] = input.nextInt();
        }
        //Output the grades 
        System.out.println("Here are the grades...........");
        for(int ctr=0;ctr<grades.length;++ctr) {
            System.out.println("Grades["+ctr+"]: " + grades[ctr]);
        }
              double sum = 0;
        for (double total : grades) {
            sum += total;
            
        }

        
        System.out.printf("\nThe average is: %.2f\n", (sum / grades.length));


        int[][] num1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("\nNUMBERS\n");
        for(int r=0;r<num1.length;++r) {
            for(int c=0;c<num1.length;++c) {
                System.out.printf("%10d",num1[r][c]);
            }
            System.out.println("\n");
        }
  
    }
}