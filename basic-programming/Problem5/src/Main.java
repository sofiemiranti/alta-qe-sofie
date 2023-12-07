import java.util.Scanner;

public class Main {
    private static boolean palindrome(String text){
        String temp = "";
        for (int i = text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }

        if (text.equalsIgnoreCase(temp)){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        if(palindrome(kata) == true){
            System.out.println("Kata " + "'" + kata + "'" + " adalah palindrome");
        } else {
            System.out.println("Kata " + "'" + kata + "'" + " adalah bukan palindrome");
        }
    }
}