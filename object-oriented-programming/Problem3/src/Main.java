import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih operasi (a/b/c/d): a. Penjumlahan ; b. Pengurangan ; c. Perkalian ; d. Pembagian");
        String opsi = input.nextLine();

        System.out.print("Input bilangan pertama : ");
        double a = input.nextDouble();
        System.out.print("Input bilangan kedua : ");
        double b = input.nextDouble();

        if (opsi.equalsIgnoreCase("a")){
            Penjumlahan jmlh = new Penjumlahan();
            jmlh.setA(a);
            jmlh.setB(b);
            System.out.println("Hasil Penjumlahan adalah " + jmlh.penjumlahan());
        }

        else if(opsi.equalsIgnoreCase("b")){
            Pengurangan krg = new Pengurangan();
            krg.setA(a);
            krg.setB(b);
            System.out.println("Hasil Pengurangan adalah " + krg.pengurangan());
        }

        else if(opsi.equalsIgnoreCase("c")){
            Perkalian kli = new Perkalian();
            kli.setA(a);
            kli.setB(b);
            System.out.println("Hasil Perkalian adalah " + kli.perkalian());
        }

        else if(opsi.equalsIgnoreCase("d")){
            Pembagian bgi = new Pembagian();
            bgi.setA(a);
            bgi.setB(b);
            System.out.println("Hasil Pembagian adalah " + bgi.pembagian());
        }

        else{
            System.out.println("Operasi tidak ditemukan.");
        }
    }
}