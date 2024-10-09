package hotel_Main;

import hotel.kamar;
import java.util.Scanner;

public class admin{
    public void aksesAdmin(kamar kamarHotel){
        Scanner input = new Scanner(System.in);
        String adminPassword = "admin";
        
        System.out.print("Masukkan password admin: ");
        String password = input.nextLine();

        if (password.equals(adminPassword)){
            System.out.println("Selamat Datang Admin!");
            System.out.println("Akses Admin:");
            System.out.println("1. Cek Kamar\n2. Lihat Detail Pesanan\n 3. Membatalkan Pesanan");
            System.out.println("------------------------");
            // Langsung menampilkan semua menu yang ada
            // Karena jika memilih salah satu dan tidak pakai looping
            // Program akan kangsung selesai jika salah satu sudah dikerjakan
            
            // Admin dapat mengecek kamar
            System.out.println("1. Cek Kamar");
            kamarHotel.cekKamar();
            System.out.println("------------------------");
            
            // Admin dapat melihat pesanan
            System.out.println("2. Lihat Detail Pesanan");
            kamarHotel.lihatDetailPesanan();
            System.out.println("------------------------");
            
            // Customer dapat membatalkan pesanan
            System.out.println("4. Batalkan Pesanan");
            System.out.print("Apakah kamu mau membatalkan pesanan?(ya/tidak):");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "ya":
                    System.out.print("Masukan nomor kamar: ");
                    int nomor = input.nextInt();
                    kamarHotel.transaksi(nomor);
                    System.out.println("------------------------");
                    break;
                case "tidak":
                    System.out.println("Terimakasih!");
                    System.out.println("------------------------");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Program Error!");
                    System.out.println("------------------------");
                    break;
            }
        }
    }
}
