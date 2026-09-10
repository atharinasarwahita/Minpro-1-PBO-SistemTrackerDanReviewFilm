# SISTEM TRACKER DAN REVIEW FILM

## Deskripsi Singkat Program
Sistem Tracker Film dan Review ini adalah program yang menangani manajemen pelacakan film dan ulasan. Setiap data memiliki informasi mengenai film, yaitu ID Film, Judul Film, Sutradara, Tahun Rilis, Genre, dan durasi. Sedangkan informasi mengenai review meliputi ID Review, Rating, dan Ulasan.  

Program ini menerapkan konsep dasar Program Berorientasi Objek (PBO) dengan mengelola data film, review user, dan pembaruan review secara real-time dengan emnggunakan ArrayList sebagai media untuk menyimpan data selama program dijalankan.

## Tujuan Program
Program Sistem Tracker Film dan Review ini dibuat dengan tujuan unutk m

## Alur Program
Program ini dimulai dengan menampilkan menu utama. Pengguna dapat memilih menu menggunakan input angka. Setiap pilihan yang di-input akan menjalankan proses yang berbeda, kemudian program menjalankan looping (kembali ke menu utama) sampai pengguna memilih menu ke 6, yaitu Keluar.  

### 1. Tambah Film
Menu pertama adalah menu tambah film (create) yang digunakan untuk menambahkan data film baru. Pengguna dapat mengisi ID film, judul, sutradara, tahun rilis, genre, dan durasi. Saat memasukkan ID, sistem memvalidasi apakah ID sudah digunakan atau belum, hal ini dilakukan untuk mencegah agar tidak adanya data ID yang duplikat.  

### 2. Tambah Review  
Menu kedua yaitu menu untuk menambahkan (create) ulasan dan juga rating pada film yang sudah disimpan. Pengguna memasukkan ID film yang ingin di-review, ID review, nilai rating (1 - 5), dan ulasan berupa teks. Pada menu ini, sistem juga memvalidasi apakah ID Film yang dimasukkan ada di dalam list, dan apakah ID Review sudah digunakan atau belum.  

### 3. Lihat Film & Review  
Menu ke-tiga ini digunakan untuk menampilkan seluruh data film beserta daftar review yang tersimpan di dalam ArrayList. Jika tidak terdapat data yang tersimpan, maka program akan menampilkan bahwa film atau review yang dimasukkan.  

### 4. Update Review  
Menu ke-empat ini digunakan untuk mengubah data review berdasarkan ID Review. Pengguna dapat memilih untuk memperbarui nilai rating atau ulasan teks. 

### 5. Hapus Review  
Menu yang ke-lima digunakan untuk menghapus data ulasan berdasarkan ID Review dari daftar review.  

### 6. Keluar  
Menu yang terakhir adalah menu keluar yang digunakan untuk menghetikan perulangan menu, menutup scanner, dan mengakhiri program.

