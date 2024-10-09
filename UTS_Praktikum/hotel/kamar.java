package hotel;

public class kamar extends reservasi{
    private String kamar1, kamar2, kamar3;
    private boolean tersedia1, tersedia2, tersedia3;
    private double harga1, harga2, harga3;
    
    // Konstruktor
    public kamar(String kamar1,String kamar2, String kamar3, 
            boolean tersedia1, boolean tersedia2, boolean tersedia3,
            double harga1, double harga2, double harga3){
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
        this.tersedia1 = tersedia1;
        this.tersedia2 = tersedia2;
        this.tersedia3 = tersedia3;
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.harga3 = harga3;
    }
    
    // Interface
    public void cekKamar(){
        System.out.println("Ketersediaan Kamar:");
        System.out.println("1. " + kamar1 + ": " + (tersedia1 ? "Tersedia" : "Tidak Tersedia") + " - Harga: Rp " + harga1);
        System.out.println("2. " + kamar2 + ": " + (tersedia2 ? "Tersedia" : "Tidak Tersedia") + " - Harga: Rp " + harga2);
        System.out.println("3. " + kamar3 + ": " + (tersedia3 ? "Tersedia" : "Tidak Tersedia") + " - Harga: Rp " + harga3);
    }

    // Method untuk memesan kamar
    public void transaksi (String namaPelanggan, int nomorKamar) {
        switch (nomorKamar){
            case 1:
                if (tersedia1){
                    // menurunkan method dari class reservasi
                    pesanKamar(namaPelanggan, kamar1, harga1);
                    tersedia1 = false;
                } else{
                    System.out.println("Kamar " + kamar1 + " sudah dipesan.");
                }
                break;
            case 2:
                if (tersedia2){
                    // menurunkan method dari class reservasi
                    pesanKamar(namaPelanggan, kamar2, harga2);
                    tersedia2 = false;
                } else {
                    System.out.println("Kamar " + kamar2 + " sudah dipesan.");
                }
                break;
            case 3:
                if (tersedia3){
                    // menurunkan method dari class reservasi
                    pesanKamar(namaPelanggan, kamar3, harga3);
                    tersedia3 = false;
                } else{
                    System.out.println("Kamar " + kamar3 + " sudah dipesan.");
                }
                break;
            default:
                System.out.println("Nomor kamar tidak valid.");
        }
    }
    
    // Overloading untuk membatalkan pesanan 
    public void transaksi (int nomorKamar){
        switch (nomorKamar) {
            case 1:
                if (!tersedia1){
                    // Mendapatkan nama pelanggan yang memesan dari class reservasi
                    System.out.println("Kamar " + kamar1 + " atas nama " + getNamaPelanggan() + " telah dibatalkan ");
                    tersedia1 = true;
                } else{
                    System.out.println("Kamar " + kamar1 + " belum dipesan.");
                }
                break;
            case 2:
                if (!tersedia2){
                    // Mendapatkan nama pelanggan yang memesan dari class reservasi
                    System.out.println("Kamar " + kamar2 + " atas nama " + getNamaPelanggan() + " telah dibatalkan ");
                    tersedia2 = true;
                } else{
                    System.out.println("Kamar " + kamar2 + " belum dipesan.");
                }
                break;
            case 3:
                if (!tersedia3){
                    // Mendapatkan nama pelanggan yang memesan dari class reservasi
                    System.out.println("Kamar " + kamar3 + " atas nama " + getNamaPelanggan() + " telah dibatalkan ");
                    tersedia3 = true;
                } else{
                    System.out.println("Kamar " + kamar3 + " belum dipesan.");
                }
                break;
            default:
                System.out.println("Nomor kamar tidak valid.");
        }
    }
}
