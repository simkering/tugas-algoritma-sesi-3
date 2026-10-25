package level_1;

public class total_penjualan_harian {
    public static void main(String[] args) {
        ///data pwnjualan toko dalam bentuk array
        int penjualan[]={100000,150000,125000,200000,175000};
        ///int persiapan bulat looping
        int total =0;
        ///looping buat ngambil data dari array terus tiap putaran nnt di tambah sama nilai yg baru di ambil
        for(int i=0; i<penjualan.length; i++){
            total += penjualan[i]; 
            }
            ///buat menampilkan hasil pak
            System.out.print("total penjualan toko selama hari ialah " + total);
        }
        
    }


