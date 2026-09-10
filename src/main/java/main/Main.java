/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author MyBook Hype
 */
import java.util.Scanner;
import service.FilmService;

public class Main {
    public static void main(String[] args) {
        FilmService service = new FilmService();
        Scanner input = new Scanner(System.in);
        
        int pilihan = 0;
        do {
            System.out.println("\n=== SISTEM TRACKER FILM & REVIEW ===");
            System.out.println("(1) Tambah Film");
            System.out.println("(2) Tambah Review");
            System.out.println("(3) Lihat Film & Review");
            System.out.println("(4) Update Review");
            System.out.println("(5) Hapus Review");
            System.out.println("(6) Keluar");
            System.out.print("Pilih menu (1-6): ");
            
            if (!input.hasNextInt()){
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    service.tambahFilm();
                    break;
                case 2:
                    service.tambahReview();
                    break;
                case 3:
                    service.lihatFilm();
                    break;
                case 4:
                    service.updateReview();
                    break;
                case 5:
                    service.hapusReview();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem!!");
                    break;
                default:
                    System.out.println("Menu yang kamu pilih tidak tersedia, coba lagi!");
            }
        } while (pilihan != 6);
        input.close();
    }
}
