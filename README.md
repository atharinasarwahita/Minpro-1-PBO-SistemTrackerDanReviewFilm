# SISTEM TRACKER DAN REVIEW FILM

## 1. Deskripsi Singkat Program
Sistem Tracker Film dan Review ini adalah program yang menangani manajemen pelacakan film dan ulasan. Setiap data memiliki informasi mengenai film, yaitu ID Film, Judul Film, Sutradara, Tahun Rilis, Genre, dan durasi. Sedangkan informasi mengenai review meliputi ID Review, Rating, dan Ulasan.  

Program ini menerapkan konsep dasar Program Berorientasi Objek (PBO) dengan mengelola data film, review user, dan pembaruan review secara real-time dengan emnggunakan ArrayList sebagai media untuk menyimpan data selama program dijalankan.

## 2. Alur Program
Program ini dimulai dengan menampilkan menu utama. Pengguna dapat memilih menu menggunakan input angka.  




Setiap pilihan yang di-input akan menjalankan proses yang berbeda, kemudian program menjalankan looping (kembali ke menu utama) sampai pengguna memilih menu ke 6, yaitu Keluar.  

### 2.1. Tambah Film
Menu pertama adalah menu tambah film (Create) yang digunakan untuk menambahkan data film baru. Pengguna dapat mengisi ID film, judul, sutradara, tahun rilis, genre, dan durasi. 

<p align="center">
<img width="1563" height="552" alt="image" src="https://github.com/user-attachments/assets/24f62e8a-1422-49b0-a7f1-9d3e77923efc" />
</p>

Saat memasukkan ID, sistem memvalidasi apakah ID sudah digunakan atau belum, hal ini dilakukan untuk mencegah agar tidak adanya data ID yang duplikat.  

### 2.2. Tambah Review  
Menu kedua yaitu menu untuk menambahkan (Create) ulasan dan juga rating pada film yang sudah disimpan. Pengguna memasukkan ID film yang ingin di-review, ID review, nilai rating (1 - 5), dan ulasan berupa teks. 

<p align="center">
<img width="1563" height="508" alt="image" src="https://github.com/user-attachments/assets/0a4b8af2-aadf-44a4-a41e-939284433e2b" />
</p>

Pada menu ini, sistem juga memvalidasi apakah ID Film yang dimasukkan ada di dalam list, dan apakah ID Review sudah digunakan atau belum.  

### 2.3. Lihat Film & Review  
Menu ke-tiga ini digunakan untuk menampilkan (Read) seluruh data film beserta daftar review yang tersimpan di dalam ArrayList. 

<p align="center">
<img width="800" alt="image" src="https://github.com/user-attachments/assets/774bbdf1-0084-4baf-bc5e-f09e9e4778ff" />
</p>

Jika tidak terdapat data yang tersimpan, maka program akan menampilkan bahwa film atau review yang dimasukkan.  

### 2.4. Update Review  
Menu ke-empat ini digunakan untuk mengubah data (Update) review berdasarkan ID Review. 

<p align="center">
<img width="800" alt="image" src="https://github.com/user-attachments/assets/be6a64e1-e81a-415a-a4a9-e9ba8f4e4ab4" />
</p>

Pengguna dapat memilih untuk memperbarui nilai rating atau ulasan teks. 

### 2.5. Hapus Review  
Menu yang ke-lima digunakan untuk menghapus data (Delete) ulasan berdasarkan ID Review dari daftar review.  

<p align="center">
<img width="800" alt="image" src="https://github.com/user-attachments/assets/567d07aa-2874-487b-a64e-06925f85a6b1" />
</p>

### 2.6. Keluar  
Menu yang terakhir adalah menu keluar yang digunakan untuk menghentikan perulangan menu, menutup scanner, dan mengakhiri program.  

<p align="center">
<img width="800" alt="image" src="https://github.com/user-attachments/assets/b16fb70b-d8a7-495e-aaf7-38f277d603ee" />
</p>


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
