import java.util.Scanner;

public class Main {
    private static void drawXYZ(int n){
        int a, b;
        a = 1;
        b = 0;

        for (int i = 0; i < n; i++){
            if(a % 3 == 0){
                System.out.print("X ");
            }
            else if(a % 2 == 0){
                System.out.print("Z ");
            }
            else if(a % 2 == 1){
                System.out.print("Y ");
            }
            b = 2 + (i * n);

            for(int j = 1; j < n; j++){
                if(b % 3 == 0){
                    System.out.print("X ");
                }
                else if(b % 2 == 0){
                    System.out.print("Z ");
                }
                else if(b % 2 == 1){
                    System.out.print("Y ");
                }
                b = b + 1;
            }
            System.out.println();
            a = a + n;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int m = input.nextInt();

        drawXYZ(m);
    }
}