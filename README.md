Deskripsi Program

Program ini memodelkan berbagai bentuk geometri menggunakan konsep OOP(Pemrograman Berorientasi Objek). Terdapat kelas Induk(Bentuk)
dan beberapa kelas turunan(BujurSangkar, Lingkaran, Silinder) yang mewarisi atribut dan metode. 

Konsep OOP yang Diterapkan:
1. Enkapsulasi
   Enkapsulasi diterapkan untuk melindungi data(atribut) di dalam setiap kelas agar tidak dapat diakses dengan atau diubah
   secara sembarangan dari luar kelas.
   - Penerapan pada kode: Semua atribut pada setiap kelas dideklarasikan dengan access modifier private:
     private String warna pada kelas Bentuk, private double sisi pada kelas BujurSangkar, private double radius pada
     kelas Lingkaran, dan private double tinggi.
   - Untuk mengakses dan mengubah nilai atribut tersebut dari luar kelas, disediakan metode getter: getWarna(),
     get Sisi(), getRadius(), dan getTinggi() dan motode setter: setWarna(String Warna), setSisi(double sisi),
     setRadius(double r), dan setTinggi(double t) dengan hak akses public.

2. Pewarisan
   Pewarisan digunakan agar kelas baru(subclass) dapat memperoleh atribut dan metode dari kelas yang sudah ada
   (superclass), sehingga menghindari duplikasi kode(reusability).
   - Single Inherintance: Kelas BujurSangkar dan Linkaran mewarisi kelas Bentuk menggunakan keyword extends.
     Kedua kelas ini secara otomatis memiliki akses ke atribut warna (melaului method turunan) dan wajib
     memanggil konstruktor induk menggunakan super(warna).
   - Multilevel Inheritance: Kelas Silinder mewarisi kelas Lingkaran (yang mana kelas Lingkaran mewarisi
     Kelas Bentuk). Dengan ini, Silinder mewarisi atribut radius dari Lingkaran dan warna dari Bentuk.

3. Polimorfisme
   Polimorfisme yang diterapkan pada program ini adalah jenis Overriding. Overriding memungkinkan subclass
   untuk memberikan implementasi yang berbeda atau spesifik untuk metode yang sudah didefinisikan di superclass.
   - Penerapan pada kode: Kelas induk Bentuk memiliki metode printInfo() yang mencetak "Bentuk berwarna[warna]".
     Kelas-kelas turunannya(BujurSangkar, Lingkaran, dan Silinder) melakukan override(menimpa) metode printInfo()
     tersebut agar mencetak informasi yang lebih spesifik, seperti menyertakan nilai luas atau volumenya.

     <img width="1279" height="675" alt="image" src="https://github.com/user-attachments/assets/a2c929ca-eddc-4a7a-8514-98e4813770b9" />

   
