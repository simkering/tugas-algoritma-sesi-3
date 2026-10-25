package level_4;

public class debugging_menghitung_rata_rata {
    public static void main(String[] args) {
        int[] scores ={80,70,90,60};
        ///sebaiknya kita menggunakan double buat sesuatu yg di akan di bagi karna takit menghasilkan desimal
        double total =0;
        ///kesalahan ad di dalam konsisi looping yg awalnya meminta nilai ujung panjang si array(bernilai 4), yg dmn akan error karna ketika i =4 indeks si array hanya sampai angka 3
        for(int i=0; i<scores.length; i++){
            total+=scores[i];
        }
        double average = total / scores.length;
        System.out.println(average);
    }

}
///1. kode tidak berjalan dengan benar akibat memiliki beberapa bug seperti i dlm looping yg batas ujungnya itu sesuai panjang array(yg hasilnya 4) yg dimana itu melebihi indeks si array yg cmn sampai 3
///2.(ad di deskripsi dalam kode)
///3.tinggal di run saja karna sudah di perbaiki
///4. sebaiknya kita menggunakan double buat sesuatu yg di akan di bagi karna takut menghasilkan desimal(klw beneran desimal nnt bisa" outputnya cmn muncul 0 hehe karna desimalnya g di anggap)
///5. tidak karna terdapat bug lain di beberapa lokasi seperti ujung nilai si i dlm kurung for