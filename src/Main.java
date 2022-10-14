import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int toplam =0;
        int sayi = sc.nextInt();

        while(sayi%2==0){

            if(sayi%4==0){
              toplam +=sayi;
            }
            sayi = sc.nextInt();
        }
        System.out.println(toplam);



















    }
}