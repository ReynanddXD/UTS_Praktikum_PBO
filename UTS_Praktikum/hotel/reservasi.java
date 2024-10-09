package hotel;

public class reservasi implements hotel{
    private String namaPelanggan;
    private String kamarDipesan;
    private double hargaKamar;
    
    // Method untuk memesan kamar
    public void pesanKamar(String namaPelanggan, String kamarDipesan, double hargaKamar){
        this.namaPelanggan = namaPelanggan;
        this.kamarDipesan = kamarDipesan;
        this.hargaKamar = hargaKamar;
        System.out.println("Kamar " + kamarDipesan + " telah dipesan oleh " + namaPelanggan);
    }

    // Method untuk melihat detail pesanan
    public void lihatDetailPesanan(){
        System.out.println("Detail Pesanan:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Kamar Dipesan: " + kamarDipesan);
        System.out.println("Harga: Rp " + hargaKamar);
    }
    
    // Encapsulation untuk mengeluarkan nilai nama pelanggan
    public String getNamaPelanggan(){
        return namaPelanggan;
    } 
}
