# SISTEM TRACKER DAN REVIEW FILM

## 1. Deskripsi Singkat Program
Sistem Tracker Film dan Review ini adalah program yang menangani manajemen pelacakan film dan ulasan. Setiap data memiliki informasi mengenai film, yaitu ID Film, Judul Film, Sutradara, Tahun Rilis, Genre, dan durasi. Sedangkan informasi mengenai review meliputi ID Review, Rating, dan Ulasan.  

Program ini menerapkan konsep dasar Program Berorientasi Objek (PBO) dengan mengelola data film, review user, dan pembaruan review secara real-time dengan emnggunakan ArrayList sebagai media untuk menyimpan data selama program dijalankan.

## 2. Alur Program
Program ini dimulai dengan menampilkan menu utama. Pengguna dapat memilih menu menggunakan input angka.  

<img width="438" height="231" alt="image" src="https://github.com/user-attachments/assets/a8a4d653-d025-490c-8856-7e51d8a70452" />


Setiap pilihan yang di-input akan menjalankan proses yang berbeda, kemudian program menjalankan looping (kembali ke menu utama) sampai pengguna memilih menu ke 6, yaitu Keluar.  

### Tambah Film
Menu pertama adalah menu tambah film (Create) yang digunakan untuk menambahkan data film baru. Pengguna dapat mengisi ID film, judul, sutradara, tahun rilis, genre, dan durasi. 

<img width="940" height="407" alt="image" src="https://github.com/user-attachments/assets/cc6f6260-b913-4635-9ad7-2167d8bf1db4" />

Saat memasukkan ID, sistem memvalidasi apakah ID sudah digunakan atau belum, hal ini dilakukan untuk mencegah agar tidak adanya data ID yang duplikat.  

### Tambah Review  
Menu kedua yaitu menu untuk menambahkan (Create) ulasan dan juga rating pada film yang sudah disimpan. Pengguna memasukkan ID film yang ingin di-review, ID review, nilai rating (1 - 5), dan ulasan berupa teks. 

<img width="856" height="348" alt="image" src="https://github.com/user-attachments/assets/4efca0e2-8da7-4d0d-9a12-e9b60bac97b5" />

Pada menu ini, sistem juga memvalidasi apakah ID Film yang dimasukkan ada di dalam list, dan apakah ID Review sudah digunakan atau belum.  

### Lihat Film & Review  
Menu ke-tiga ini digunakan untuk menampilkan (Read) seluruh data film beserta daftar review yang tersimpan di dalam ArrayList. 

<img width="1536" height="378" alt="image" src="https://github.com/user-attachments/assets/72316c3a-d3ca-4fe8-b24d-0e5f09b4ae88" />

Jika tidak terdapat data yang tersimpan, maka program akan menampilkan bahwa film atau review yang dimasukkan.  

### Update Review  
Menu ke-empat ini digunakan untuk mengubah data (Update) review berdasarkan ID Review. 

<img width="1539" height="350" alt="image" src="https://github.com/user-attachments/assets/caa6652b-b165-433c-bc91-917c751664c6" />

Pengguna dapat memilih untuk memperbarui nilai rating atau ulasan teks. 

### Hapus Review  
Menu yang ke-lima digunakan untuk menghapus data (Delete) ulasan berdasarkan ID Review dari daftar review.  

<img width="1548" height="209" alt="image" src="https://github.com/user-attachments/assets/586e5bb6-b84b-4a1e-996e-9e210b962c01" />


### Keluar  
Menu yang terakhir adalah menu keluar yang digunakan untuk menghentikan perulangan menu, menutup scanner, dan mengakhiri program.  

<img width="822" height="389" alt="image" src="https://github.com/user-attachments/assets/d2200c7e-6eef-4c7c-b238-c93338cb2842" />


## 3. Penerapan Nilai Tambah  

### Access Modifier  
Access Modifier pada program ini diterapkan pada seluruh atribut pada class Film dan Review bersifat private dan hanya dapat diakses melalui method public, seperti getter, setter, dan service (CRUD).  

<img width="558" height="125" alt="image" src="https://github.com/user-attachments/assets/32d02aaf-cd70-4f94-b414-3ba47e1fd2d4" />

Access Modifier ini digunakan agar data antar class tidak dapat diakses sembarangan.  

## Encapsulation  
Data pada class Film dan Review menggunakan atribut private. Pembacaan data dari luar class wajib melalui getter (contoh: getIdReview()), sedangkan pembaruan data dilakukan melalui setter (contoh: setRating()).  

<img width="769" height="338" alt="image" src="https://github.com/user-attachments/assets/c2fb17fc-9773-45e0-a81f-7a19dedc5a02" />

Encapsulation digunakan untuk menjaga konsistensi dan keamanan data yang digunakan.  

## Validasi Input  
Penerapan validasi input bertujuan untuk mencegah program eror (crash) saat menginput kesalahan pada tipe data dan memastikan input sesuai dengan logika program. pengecekan dilakukan saat pengguna memasukkan data pada output.  

<img width="716" height="169" alt="image" src="https://github.com/user-attachments/assets/3d5842df-fc56-41a9-9c93-a45344984a78" />

Pengecekan menggunakan hasNextInt() dan hasNextDouble() digunakan untuk menolak input berupa huruf saat meminta angka, perulangan while(true) digunakan untuk membatasi nilai rating wajib berada di rentang 1.0 sampai 5.0, serta pengecekan ID dilakukan untuk mencegah adanya duplikasi ID Film dan ID Review.
