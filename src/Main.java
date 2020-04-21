
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Lütfen Hesaplanması Gerekenen Sayıyı Giriniz..: ");
        int faktoriyel = 1;
        
        int sayi=sca.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel: " + faktoriyel);
    }
}
