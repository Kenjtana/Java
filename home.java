package Project;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class home {
    public static void main(String[] args) {
        String[] listGenre = {"1. Novel", "2. Komik", "3. Dongeng", "4. Self-Development", };
        String Nama, Alamat, Intitusi, NoHP;
        int Harga = 0;
        System.out.println("Selamat Datang di Perpustakaan!");
        System.out.println(" ");
        
        // data diri
        System.out.println("ISI DATA DIRI UNTUK MENYEWA BUKU");
        Scanner dataDiri = new Scanner(System.in);
        System.out.println("Isi Data Diri");
        System.out.print("Nama lengkap: ");
        Nama = dataDiri.nextLine();

        System.out.print("Alamat: ");
        Alamat =  dataDiri.nextLine();

        System.out.print("Asal Institusi / Sekolah: ");
        Intitusi = dataDiri.nextLine();

        System.out.print("No. HP: ");
        NoHP = dataDiri.nextLine();
        
        System.out.println("==========");
        System.out.println("==========");


        System.out.println(" ");
        // menampilkan list genre
        System.out.println("Berikut buku-buku yang tersedia: ");
        for(int i = 0; i<listGenre.length;i++){
            System.out.println(listGenre[i]);
        }
        
        // input genre
        System.out.println(" ");
        Scanner inputGenre = new Scanner(System.in);
        System.out.print("Silahkan pilih nomor berdasarkan genre: ");
        int pilihGenre = inputGenre.nextInt();
        
        switch (pilihGenre) {
            case 1:
            System.out.println("Anda memilih buku novel dengan biaya Rp 5.000 per hari");
            break;
            case 2:
            System.out.println("Anda memilih komik dengan biaya Rp 5.000 per hari");
            break;
            case 3:
            System.out.println("Anda memilih buku dongeng dengan biaya Rp 3.000 per hari");
            break;
            case 4:
            System.out.println("Anda memilih buku self-development dengan biaya Rp 8.000 per hari");
            break;
            default:
            System.out.println("Invalid!! HARAP MASUKAN NOMOR BUKU YANG TERSEDIA!");
            break;
        }
        
        // input hari
        System.out.println(" ");
        Scanner inputHari = new Scanner(System.in);
        System.out.println("Batas MAX MEMINJAM buku adalah 14 HARI");
        System.out.println("Pilih jangka waktu meminjam: (hari)");
        int pilihHari = inputHari.nextInt();

        if(pilihHari > 14){
            System.out.println("MAKSIMAL PEMINJAMAN ADALAH 14 HARI!");
        }
        
        // hitung harga
        System.out.println(" ");
        if(pilihGenre == 1){
            Harga = 5000 * pilihHari;
        } else if (pilihGenre == 2){
            Harga = 5000 * pilihHari;
        } else if (pilihGenre == 3){
            Harga = 3000 * pilihHari;
        } else if (pilihGenre == 4){
            Harga = 8000 * pilihHari;
        }

        System.out.println("Atas nama "+Nama);
        System.out.println("Kode genre buku : "+pilihGenre);
        System.out.println("Jangka waktu menyewa : "+pilihHari+" hari");
        System.out.println("Total biaya untuk menyewa : Rp"+Harga);

    }
}