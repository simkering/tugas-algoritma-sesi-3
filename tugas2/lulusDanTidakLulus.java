package tugas2;
import java.util.Scanner;
public class lulusDanTidakLulus {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.println("berapa nilai mahasiswa? ");
        double nilaiMahasiswa = imputan.nextInt();
        imputan.close();
        if (nilaiMahasiswa >= 60) {
            System.out.println("mahasiswa lulus");
        } else {
            System.out.println("mahasiswa tidak lulus");
        }
    }
}