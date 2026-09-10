# SISTEM TRACKER DAN REVIEW FILM

## 1. Deskripsi Singkat Program
Sistem Tracker Film dan Review ini adalah program yang menangani manajemen pelacakan film dan ulasan. Setiap data memiliki informasi mengenai film, yaitu ID Film, Judul Film, Sutradara, Tahun Rilis, Genre, dan durasi. Sedangkan informasi mengenai review meliputi ID Review, Rating, dan Ulasan.  

Program ini menerapkan konsep dasar Program Berorientasi Objek (PBO) dengan mengelola data film, review user, dan pembaruan review secara real-time dengan emnggunakan ArrayList sebagai media untuk menyimpan data selama program dijalankan.

## 2. Alur Program
Program ini dimulai dengan menampilkan menu utama. Pengguna dapat memilih menu menggunakan input angka. Setiap pilihan yang di-input akan menjalankan proses yang berbeda, kemudian program menjalankan looping (kembali ke menu utama) sampai pengguna memilih menu ke 6, yaitu Keluar.  

### Tambah Film
Menu pertama adalah menu tambah film (Create) yang digunakan untuk menambahkan data film baru. Pengguna dapat mengisi ID film, judul, sutradara, tahun rilis, genre, dan durasi. Saat memasukkan ID, sistem memvalidasi apakah ID sudah digunakan atau belum, hal ini dilakukan untuk mencegah agar tidak adanya data ID yang duplikat.  

### Tambah Review  
Menu kedua yaitu menu untuk menambahkan (Create) ulasan dan juga rating pada film yang sudah disimpan. Pengguna memasukkan ID film yang ingin di-review, ID review, nilai rating (1 - 5), dan ulasan berupa teks. Pada menu ini, sistem juga memvalidasi apakah ID Film yang dimasukkan ada di dalam list, dan apakah ID Review sudah digunakan atau belum.  

### Lihat Film & Review  
Menu ke-tiga ini digunakan untuk menampilkan (Read) seluruh data film beserta daftar review yang tersimpan di dalam ArrayList. Jika tidak terdapat data yang tersimpan, maka program akan menampilkan bahwa film atau review yang dimasukkan.  

### Update Review  
Menu ke-empat ini digunakan untuk mengubah data (Update) review berdasarkan ID Review. Pengguna dapat memilih untuk memperbarui nilai rating atau ulasan teks. 

### Hapus Review  
Menu yang ke-lima digunakan untuk menghapus data (Delete) ulasan berdasarkan ID Review dari daftar review.  

### Keluar  
Menu yang terakhir adalah menu keluar yang digunakan untuk menghentikan perulangan menu, menutup scanner, dan mengakhiri program.  

## 3. Penerapan Nilai Tambah  

### Access Modifier  
Access Modifier pada program ini diterapkan pada seluruh atribut pada class Film dan Review bersifat private dan hanya dapat diakses melalui method public, seperti getter, setter, dan service (CRUD). Access Modifier ini digunakan agar data antar class tidak dapat diakses sembarangan.  

## Encapsulation  
Data pada class Film dan Review menggunakan atribut private. Pembacaan data dari luar class wajib melalui getter (contoh: getIdReview()), sedangkan pembaruan data dilakukan melalui setter (contoh: setRating()). Encapsulation digunakan untuk menjaga konsistensi dan keamanan data yang digunakan.  

## Validasi Input  
Penerapan validasi input bertujuan untuk mencegah program eror (crash) saat menginput kesalahan pada tipe data dan memastikan input sesuai dengan logika program. pengecekan dilakukan saat pengguna memasukkan data pada output.  

Pengecekan menggunakan hasNextInt() dan hasNextDouble() digunakan untuk menolak input berupa huruf saat meminta angka, perulangan while(true) digunakan untuk membatasi nilai rating wajib berada di rentang 1.0 sampai 5.0, serta pengecekan ID dilakukan untuk mencegah adanya duplikasi ID Film dan ID Review.
