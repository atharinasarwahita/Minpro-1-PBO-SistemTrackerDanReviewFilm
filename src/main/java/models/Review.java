/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Review {
    private int idReview;
    private double rating;
    private String ulasan;
    
    //Constructor
    public Review(int idReview, String ulasan, double rating) {
        this.idReview = idReview;
        this.ulasan = ulasan;
        this.rating = rating;
    }
        
    //Getter & Setter
    public int getIdReview() {
        return idReview; 
    }
    
    public String getUlasan() {
        return ulasan; 
    }

    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
    }
    
    public double getRating() {
        return rating; 
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
}
