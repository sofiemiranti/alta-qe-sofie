import java.util.Scanner;

public class Main {
    private static boolean primeNumber(int number){
        int i, faktor = 0;
        for (i = 1; i<=number; i++){
            if(number%i==0){
                faktor = faktor + 1;
            }
        }
        if (faktor == 2){
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int n = input.nextInt();
        if (primeNumber(n) == true) {
            System.out.println(n + " adalah prima");
        } else {
            System.out.println(n + " bukan prima");
        }
    }

}