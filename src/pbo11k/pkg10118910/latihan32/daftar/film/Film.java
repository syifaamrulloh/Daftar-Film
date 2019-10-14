/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan32.daftar.film;

/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk menampilkan Daftar Film
 * dengan konsep Objek
 */
public class Film {
    //Set Atribute/Variable
    public String filmName,filmGenre;
    public double filmRating;
    public int filmDuration;
    
    //Buat Opration Method
    public void nowPlaying(){
        System.out.println("Judul Film\t: " + filmName);
        System.out.println("Genre Flm\t: " + filmGenre);
        System.out.println("Rating Film\t: " + filmRating);
        System.out.println("Duration Film\t: " + filmDuration + " Menit\n");
    }
    
    public static void main(String[] args) {
        System.out.println("========== Daftar Film Sedang Tayang ==========");
        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 9;
        film1.filmDuration = 120;
        film1.nowPlaying();
        
        Film film2 = new Film();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9;
        film2.filmDuration = 96;
        film2.nowPlaying();
        
        Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying();
        
        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6;
        film4.filmDuration = 100;
        film4.nowPlaying();
    }
    
}
