import java.util.ArrayList;
import java.util.Scanner;
public class Caffe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pesanan = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        
        String[] menu = {"Nasi Goreng - Rp20000", "Mie Goreng - Rp15000", "Roti Bakar - Rp12000",
                         "Kentang Goreng - Rp10000", "Teh Tarik - Rp8000", "Cappucino - Rp20000",
                         "Chocolate Ice - Rp25000"};
        int[] hargaMenu = {20000, 15000, 12000, 10000, 8000, 20000, 25000};
        
        while (true) {
            System.out.println("=== Selamat Datang di Kafe ===");
            System.out.println("=== Menu ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("\nPilih opsi berikut:");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Daftar Pesanan");
            System.out.println("3. Hitung Total Biaya");
            System.out.println("4. Selesai");
            
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            if (pilihan == 1) {
                System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                int nomorMenu = scanner.nextInt();
                System.out.print("Masukkan jumlah pesanan: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); 
                
                if (nomorMenu >= 1 && nomorMenu <= menu.length) {
                    pesanan.add(menu[nomorMenu - 1] + " x" + jumlah);
                    harga.add(hargaMenu[nomorMenu - 1] * jumlah);
                    System.out.println(menu[nomorMenu - 1] + " berhasil ditambahkan ke pesanan.\n");
                } else {
                    System.out.println("Menu tidak valid.\n");
                }
            } else if (pilihan == 2) {
                System.out.println("=== Daftar Pesanan ===");
                int totalSementara = 0;
                for (int i = 0; i < pesanan.size(); i++) {
                    System.out.println((i + 1) + ". " + pesanan.get(i) + " - Rp" + harga.get(i));
                    totalSementara += harga.get(i);
                }
                System.out.println("Total Biaya Sementara: Rp" + totalSementara + "\n");
            } else if (pilihan == 3) {
                int totalBiaya = 0;
                for (int h : harga) {
                    totalBiaya += h;
                }
                System.out.println("Total biaya seluruh pesanan: Rp" + totalBiaya + "\n");
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah memesan di kafe kami!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        }
        
        scanner.close();
    }
}

