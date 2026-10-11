package tugas2;
import java.util.Scanner;
public class programKasir {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.println("uang belanja anda? ");
        double uangBelanja = imputan.nextDouble();
        System.out.println("total belanja anda? ");
        double totalBelanja = imputan.nextDouble();
        imputan.nextLine();
        System.out.println("apakah anda member atw bukan?(yes/no) ");
        String statusMember = imputan.nextLine();
        imputan.close();
        if (statusMember.equalsIgnoreCase("yes")) {
            double hargaSetelahDidiskon = totalBelanja -(totalBelanja * 10/100);
            if (uangBelanja > hargaSetelahDidiskon) {
                double kembalian = uangBelanja - hargaSetelahDidiskon;
                System.out.println("total belanjaan anda jadi:" + hargaSetelahDidiskon + "kembalian anda: " + kembalian);
            } else if (uangBelanja == hargaSetelahDidiskon) {
                System.out.println("total belanja anda:" + hargaSetelahDidiskon + "uang anda pas");
            } else{
                System.out.println("uang anda kurang");
            }
        } else if (statusMember.equalsIgnoreCase("no") && uangBelanja > totalBelanja) {
            double kembalian = uangBelanja - totalBelanja;
            System.out.println("total belanja anda: " + totalBelanja + "kembalian anda:" + kembalian);
        } else if (statusMember.equalsIgnoreCase("no") && uangBelanja == totalBelanja) {
            System.out.println("total belanja anda: " + totalBelanja + "uang anda pas");
        } else {
            System.out.println("uang anda kurang");
        }
    }

}
