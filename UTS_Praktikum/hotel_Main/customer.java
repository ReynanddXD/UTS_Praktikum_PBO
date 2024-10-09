package hotel_Main;

import hotel.kamar;
import java.util.Scanner;

public class customer{
    public void aksesCustomer(kamar kamarHotel){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat Datang Customer!");
        System.out.println("Akses Customer:");
        System.out.println("1. Cek Kamar\n2. Pesan Kamar\n3. Lihat Detail Pesanan\n4. Batalkan Pesanan");
        System.out.println("------------------------");
        
        // Langsung menampilkan semua menu yang ada
        // Karena jika memilih salah satu dan tidak pakai looping
        // Program akan kangsung selesai jika salah satu sudah dikerjakan
        
        // Customer mengecek kamar
        System.out.println("1. Cek Kamar");
        kamarHotel.cekKamar();
        System.out.println("------------------------");

        // Customer memesan kamar
        System.out.println("2. Pesan Kamar");
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukan nomor kamar: ");
        int nomor = input.nextInt();
        input.nextLine();
        kamarHotel.transaksi(nama, nomor);
        System.out.println("------------------------");

        // Customer dapat melihat detail pesanan
        System.out.println("3. Lihat Detail Pesanan");
        kamarHotel.lihatDetailPesanan();
        System.out.println("------------------------");
        
        // Customer dapat membatalkan pesanan
        System.out.println("4. Batalkan Pesanan");
        System.out.print("Apakah kamu mau membatalkan pesanan?(ya/tidak):");
        String pilihan = input.nextLine();
        switch (pilihan) {
            case "ya":
                kamarHotel.transaksi(nomor);
                System.out.println("------------------------");
                break;
            case "tidak":
                System.out.println("Terimakasih Sudah Memesan!");
                System.out.println("------------------------");
                break;
            default:
                System.out.println("Pilihan Tidak Valid, Program Error!");
                System.out.println("------------------------");
                break;
        }
    }
}
