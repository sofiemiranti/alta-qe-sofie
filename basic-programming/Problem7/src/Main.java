import java.util.Scanner;

public class Main {
    private static double mean(double[] y){
        double total;
        double rata;
        total = 0;

        for(int i = 0; i < y.length ; i++){
            total = total + y[i];
        }
        rata = total / y.length;
        return rata;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah data: ");
        int n = input.nextInt();
        System.out.println("Masukkan nilai: ");
        double[] x = new double[n];

        for(int i = 0; i < x.length; i++){
            x[i] = input.nextDouble();
        }

//        for(int i = 0; i <= x.length-2 ; i++){
//            System.out.print(x[i] + " + ");
//        }
//        System.out.println(x[x.length-1]);

        System.out.println("Rata-ratanya adalah " + mean(x));
    }
}