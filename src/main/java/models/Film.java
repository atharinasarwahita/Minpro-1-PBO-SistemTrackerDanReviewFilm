/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Film {
    private int idFilm;
    private String judul;
    private String sutradara;
    private int tahunRilis;
    private String genre;
    private int durasi;
    
    //Constructor
    public Film(int idFilm, String judul, String sutradara, int tahunRilis, String genre, int durasi) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
        this.genre = genre;
        this.durasi = durasi;
    }
    
    //Getter & Setter
    public int getIdFilm() {
        return idFilm;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getSutradara() {
        return sutradara;
    }
    
    public void setStradara(String sutradara) {
        this.sutradara = sutradara;
    }
    
    public int getTahunRilis() {
        return tahunRilis;
    }
    
    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}
