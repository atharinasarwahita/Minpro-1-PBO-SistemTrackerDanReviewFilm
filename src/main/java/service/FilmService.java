/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import models.Film;
import models.Review;

public class FilmService {
    private ArrayList<Film> daftarFilm = new ArrayList<>();
    private ArrayList<Review> daftarReview = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
//CREATE
public void tambahFilm() {
    System.out.print("Masukkan ID Film: ");
    if (!input.hasNextInt()) {
        System.out.println("ID harus berupa angka!");
        input.nextLine();
    return;
    }
    int idFilm = input.nextInt();
    input.nextLine();
    
    //Validasi ID unik
    for (Film f : daftarFilm) {
        if (f.getIdFilm() == idFilm) {
            System.out.println("ID Sudah Digunakan! Silakan gunakan ID lain.");
            return;
        }
    }
    
    System.out.print("Masukkan Judul Film: ");
    String judul = input.nextLine();
 
    System.out.print("Masukkan Sutradara Film: ");
    String sutradara = input.nextLine();
    
    System.out.print("Masukkan Tahun Rilis Film: ");
    int tahunRilis = input.nextInt();
    input.nextLine();
    
    System.out.print("Masukkan Genre Film: ");
    String genre = input.nextLine();
    
    System.out.print("Masukkan Durasi Film: ");
    int durasi = input.nextInt();
    input.nextLine();
    
    daftarFilm.add(new Film(idFilm, judul, sutradara, tahunRilis, genre, durasi));
    System.out.println("Yeayy, film kamu berhasil ditambahkan!");
    lihatFilm();
}

public void tambahReview() {
    
    if (daftarFilm.isEmpty()) {
        System.out.println("Belum ada film di sini!");
        return;
        }
        
    System.out.print("Masukkan ID Film yang mau di-review: ");
    if (!input.hasNextInt()) {
        System.out.println("ID harus berupa angka!");
        input.nextLine();
        return;
    }
    int cariFilm = input.nextInt();
    input.nextLine();
    
    boolean adaFilm = false;
    for (Film f : daftarFilm) {
        if (f.getIdFilm() == cariFilm){
            adaFilm = true;

            System.out.print("Masukkan ID Review: ");
            if (!input.hasNextInt()) {
                System.out.println("ID harus berupa angka!");
                input.nextLine();
                return;
            }
            int idReview = input.nextInt();
                input.nextLine();

            //Validasi ID unik
            for (Review r : daftarReview) {
                if (r.getIdReview() == idReview) {
                    System.out.println("ID Sudah Digunakan! Silakan gunakan ID lain.");
                    return;
                }
            }

            System.out.print("Masukkan Rating Film (1 - 5): ");
            if (!input.hasNextDouble()) {
            System.out.println("Rating harus berupa angka!");
            input.nextLine();
            return;
            }
            double rating = input.nextDouble();
            input.nextLine();

            if (rating < 1.0 || rating > 5.0) {
                System.out.println("Rating harus di antara 1.0 sampai 5.0!");
                return;
            }

            System.out.print("Masukkan Ulasan Film: ");
            String ulasan = input.nextLine();

            daftarReview.add(new Review(idReview, ulasan, rating));
            System.out.println("Yeayy, review kamu berhasil ditambahkan!");
            lihatFilm();
        }
    }
    
    if (!adaFilm) {
        System.out.println("ID film tidak ada di sistem!");
    }
}

//READ
public void lihatFilm() {
    if (daftarFilm.isEmpty()) {
        System.out.println("----------------------------------");
        System.out.println("Belum ada film yang kamu masukkan!");
        System.out.println("----------------------------------");
    } else {
        System.out.println("\n --------- DAFTAR FILM ---------");
        for (Film f : daftarFilm) {
            System.out.println("ID Film: " + f.getIdFilm() + " | Judul: " + f.getJudul() + " | Sutradara: " + f.getSutradara() + " |  Tahun Rilis: " + f.getTahunRilis() + " | Genre: " + f.getGenre() + " | Durasi: " + f.getDurasi()+" menit");
    }
    }
    if (daftarReview.isEmpty()) {
        System.out.println("------------------------------------");
        System.out.println("Belum ada review yang kamu masukkan!");
        System.out.println("------------------------------------");
    } else {  
        System.out.println("\n --------- DAFTAR REVIEW ---------");
        for (Review r : daftarReview) {
            System.out.println("ID Review: " + r.getIdReview() + " | Rating: " + r.getRating() + " | Ulasan: " + r.getUlasan());
        }
    }
}

//UPDATE REVIEW
public void updateReview() {
    lihatFilm();
        if (daftarReview.isEmpty()) {
            return;
    }
    
    System.out.print("\nMasukkan ID review yang mau di-update: ");
    if (!input.hasNextInt()) {
        System.out.println("ID harus berupa angka!");
        input.nextLine();
    return;
    }
    int updateIdReview = input.nextInt();
    input.nextLine();
    
    boolean adaReview = false;
    for (Review r : daftarReview) {
        if (r.getIdReview() == updateIdReview) {
            adaReview = true;
            System.out.println("(1) Rating");
            System.out.println("(2) Ulasan");
            System.out.println("Pilih ulasan film yang ingin diubah:");
            int updateReviewPilihan = input.nextInt();
            input.nextLine();
            
            switch (updateReviewPilihan) {
                case 1 -> { System.out.print("Rating Film Baru: ");
                    double ratingBaru = input.nextDouble();
                    input.nextLine();
                    r.setRating(ratingBaru);
                    System.out.println("Yeayy, rating baru kamu berhasil ditambahkan!");
                    lihatFilm();
                    return;
                }
                    
                case 2 -> { System.out.print("Ulasan Film Baru: ");
                    String ulasanBaru = input.nextLine();
                    r.setUlasan(ulasanBaru);
                    System.out.println("Yeayy, ulasan terbaru kamu berhasil ditambahkan!");
                    lihatFilm();
                    return;
                }
                
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
    if (!adaReview) {
    System.out.println("ID Review tidak ditemukan!");
    }
}
 
//DELETE REVIEW
public void hapusReview(){
    lihatFilm();
    if (daftarReview.isEmpty()) {
        return;
    }
    
    System.out.print("\nMasukkan ID Review yang mau dihapus: ");
    if (!input.hasNextInt()) {
        System.out.println("ID harus berupa angka!");
        input.nextLine();
        return;
        }
    int hapusReview = input.nextInt();
    input.nextLine();
        
    for (Review r : daftarReview) {
        if (r.getIdReview() == hapusReview) {
            daftarReview.remove(r);
            System.out.println("Review berhasil dihapus!");
            lihatFilm();
            return;
            }
        }
        System.out.println("ID Review tidak ditemukan!");
}
}