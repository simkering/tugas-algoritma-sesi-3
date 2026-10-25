package level_1;

public class daftar_nilai {
    public static void main(String[] args) {
        ///data nilai mahasiswa tercinta in array
        int nilai[] ={80,75,90,65,85};
        ///untuk menampilkan nilai mahasiswa tercinta satu persatu
        for (int i=0;  i<nilai.length; i++){
        System.out.println("nilai mahasiswa ke-"+ (i+1) + " = " + nilai[i]);
        }
        ///untuk menampilkan indeks ke-2 sang mahasiswa in array
        System.out.println("nilai mahasiswa indeks ke-2="+ nilai[2]);

    }
}