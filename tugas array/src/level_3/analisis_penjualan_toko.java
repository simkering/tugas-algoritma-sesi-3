package level_3;

public class analisis_penjualan_toko {
    public static void main(String[] args) {
        int pToko[]={250,300,180,420,350,300,500,150,420,380
    };
    int N=pToko.length;
    double total=0;
    for (int i : pToko){
        total=total+i;
    }
    double rata=total/N;
    System.out.println("total pndapatan toko ialah: " + total);
    System.out.println("rata-rata pendapatan toko ialah: " + rata);
    for (int i=0; i<N; i++){
        if (pToko[i]>rata) {
            System.out.println("pendapatan toko yg melebihi rata-rata ad di hari-"+(i+1)+" dengan total pendapatan: "+pToko[i]);
        }
    }
    int modus = pToko[0];
    int fmaks =0;
    for (int i=0; i<N; i++){
        int hitung=0;
        for (int a=0; a<N; a++){
            if (pToko[a]==pToko[i]) {
                hitung++;
            }
        }
        if (hitung>fmaks) {
            fmaks=hitung;
            modus=pToko[i];
        }
    }
    System.out.println("modus pendapatan toko ialah: " + modus+ " yg muncul sebanyak "+fmaks+" kali");
    int maks1=0;
    int maks2=0;
    int day1=0;
    int day2=0;
    for(int i=0; i<N; i++){
        if (pToko[i]>maks1) {
            maks2=maks1;
            day2=day1;
            maks1=pToko[i];
            day1=i+1;
        } else if (pToko[i]>maks2) {
            maks2=pToko[i];
            day2=i+1;
        }
    }
    System.out.println("pendapatan terbesar jatuh pada hari ke-"+day1+" dengan total pendapatan: "+maks1);
    System.out.println("pendapatan runnerup jatuh pada hari ke-"+day2+" dengan total pendapatan: "+maks2);
    int jumlah=0;
    for(int i=1; i<N; i++){
        if (pToko[i]<pToko[i-1]) {
            System.out.println("hari ke-"+(i)+" dengan pendapatan: "+pToko[i]+" lebih kecil dari hari sebelumnya yg memiliki pendapatan: "+pToko[i-1]);
            jumlah++;
        }
    }
    System.out.println("total hari yg jumlah pendapataannya lebih kecil dari hari sebelumnya ialah: "+jumlah);
    }
}