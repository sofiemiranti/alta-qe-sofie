import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputbilangan = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        int N = inputbilangan.nextInt();
        int i;

        System.out.println("Faktor dari " + N + " adalah :");

        for(i=1 ; i<=N ; i++){
            if(N % i == 0){
                System.out.print(i + "\n");
            }
        }
    }
}