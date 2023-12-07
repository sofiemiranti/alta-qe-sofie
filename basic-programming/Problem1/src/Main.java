import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Alas (cm) \t: ");
        float alas = input.nextFloat();
        System.out.print("Input Tinggi (cm) \t: ");
        float tinggi = input.nextFloat();
        System.out.println();

        float luas = (alas * tinggi) / 2;
        System.out.print("Luas segitiga adalah " + luas + " cm2");
    }
}