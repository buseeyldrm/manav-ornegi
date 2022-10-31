import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ...");

        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        System.out.print("Kaç kilo armut alacaksın ? :");
        double armutKilo= klavye.nextDouble();

        System.out.print("Kaç kilo elma alacaksın ? : ");
        double elmaKilo= klavye.nextDouble();

        System.out.print("Kaç kilo domates alacaksın ? :");
        double damatesKilo= klavye.nextDouble();

        System.out.print("Kaç kilo muz alacaksın ? :");
        double muzKilo= klavye.nextDouble();

        System.out.print("Kaç kilo patlıcan alacaksınız ? :");
        double patlicanKilo= klavye.nextDouble();

        System.out.println();
        double tutar=(armut*armutKilo)+(elmaKilo*elma)+(domates*damatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam tutar: " +tutar);

    }
}