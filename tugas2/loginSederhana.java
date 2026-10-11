package tugas2;
import  java.util.Scanner;
public class loginSederhana {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.println("masukan username anda ");
        String username = imputan.nextLine();
        System.out.println("masukan pasword anda ");
        String pasword = imputan.nextLine();
        imputan.close();
        if ( username.equals("admin")) {

            if (pasword.equals("12345")) {
              System.out.println("selamat login ");  
            } else {
                System.out.println("pasword salah ");
            }
        } else {
            System.out.println("username salah ");
        }
    }

}
