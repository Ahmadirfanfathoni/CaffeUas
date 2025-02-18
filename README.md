
PENJELASAN
- Deklarasi Menu dan Harga:

Program memiliki daftar menu makanan dan minuman, serta harga masing-masing dalam bentuk array menu dan hargaMenu.

- Menu Utama:

Program menampilkan menu dengan nomor pilihan.
Pengguna diberikan 4 opsi:
  - Tambah Pesanan: Menambahkan item berdasarkan nomor menu yang dipilih dan jumlah yang diinginkan.
  - Lihat Daftar Pesanan: Menampilkan pesanan yang sudah dimasukkan beserta harga dan total sementara.
  - Hitung Total Biaya: Menampilkan total biaya semua pesanan.
  - Selesai: Mengakhiri program.


Proses Input dan Validasi:

  - Pengguna memasukkan pilihan menu dan nomor item untuk pesanan.
  - Program memvalidasi input pengguna agar nomor menu valid, dan menghitung total harga    berdasarkan jumlah pesanan.

Fungsi dan Output:

  - Jika pengguna memilih untuk menambah pesanan, pesanan dan harga disimpan dalam ArrayList.
  - Saat memilih untuk melihat daftar pesanan atau menghitung total biaya, program menampilkan informasi yang relevan.

Akhir Program:

  - Program berhenti jika pengguna memilih opsi "Selesai" (pilihan 4).
  - Program ini memberi pengalaman pengguna untuk memesan di kafe, melihat pesanan, menghitung total biaya, dan mengakhiri transaksi dengan mudah.

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

