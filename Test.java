
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // değişkenler
        double kdvoran=0.18;
        double kdvoran2=0.08;
        double money;


        Scanner bob = new Scanner(System.in);
    // değerler
        System.out.print("parayı giriniz:");
        money = bob.nextInt();
        double kdv_tutar = money*kdvoran;
        double kdvlitutar= money+kdv_tutar;
        double kdv_tutar2 = money*kdvoran2;
        double kdvlitutar2= money+kdv_tutar;
        if (money<=1000);
        System.out.println("kdv oranı:" + kdv_tutar);
        System.out.println("kdvli oran:" + kdvlitutar);
        if (money>1000);
        System.out.println("kdv oranı:" + kdv_tutar2);
        System.out.println("kdvli oran:" + kdvlitutar2);


    } }