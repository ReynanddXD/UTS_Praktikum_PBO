package hotel_Main;

import hotel.kamar;
import java.util.Scanner;

public class hotelMain{

    public static void main(String[] args){
        // Membuat ketersediaan kamar
        kamar kamarHotel = new kamar("Deluxe", "Suite", "Superior", 
                true, true, true, 
                500000, 750000, 1000000);
        
        Scanner input = new Scanner(System.in);
        
        // Pilihan akses
        System.out.print("1. Admin\n2. Customer\nPilih user kamu (1/2) : ");
        int pilihan1 = input.nextInt();
        input.nextLine();
        
        // Direkomedasikan untuk memilih mode customer terlebih dahulu
        // Agar saat mode admin dapat meilhat detail pesanan juga
        // Pilihan akses akan dijalankan 2 kali, 
        // Karena agar dapat mengecek kedua pilihan tersebut
        
        // x1
        // Mode admin
        if (pilihan1 == 1){
            admin admin = new admin();
            admin.aksesAdmin(kamarHotel);
        // Mode customer    
        } else if (pilihan1 == 2){
            customer customer = new customer();
            customer.aksesCustomer(kamarHotel);
        } else {
            System.out.println("Pilihan Tidak Valid, Program Error!");
        }
        
        // Pilihan akses
        System.out.print("1. Admin\n2. Customer\nPilih user kamu (1/2) : ");
        int pilihan2 = input.nextInt();
        input.nextLine();
        
        // x2
        // Mode admin
        if (pilihan2 == 1){
            admin admin = new admin();
            admin.aksesAdmin(kamarHotel);
        // Mode customer    
        } else if (pilihan2 == 2){
            customer customer = new customer();
            customer.aksesCustomer(kamarHotel);
        } else{
            System.out.println("Pilihan Tidak Valid, Program Error!");
        }
    }
}
