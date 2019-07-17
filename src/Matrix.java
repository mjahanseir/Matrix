import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("what is your number of raw :");
        int raw = scan.nextInt();
        System.out.print("what is your number of column :");
        int column = scan.nextInt();

        int[][] matrix1 = new int[raw][column];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Enter your number :");
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Your input : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%d \t" , matrix1[i][j]);
            }
            System.out.println();
        }
    }
}
