import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,k1=4,k2=5;
        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        sayi=oku.nextInt();

        System.out.println("4e bolunebilme kurallari");
        while (sayi>k1){
            System.out.println(k1);
            k1+=4;
        }

        System.out.println("5e bolunebilme kurallari");
        while (sayi>k2){
            System.out.println(k2);
            k2+=5;
        }


    }
}