# Connect Database
Menghubungkan database ke GUI di NetBeans umumnya melibatkan beberapa langkah untuk memastikan bahwa aplikasi GUI Anda dapat berinteraksi dengan data dalam database. 

### **Tutorial:**
1. Untuk koneksikan database di postgreSQL dengan neatbeans dengan cara klik Services, lalu pada database klik kanan, lalu klik new connection. Kemudian, di bagian Driver pilih PostgreSQL, lalu klik next
2. Setelah di next, kita bisa atur port, nama database, dan masukkan password dari PostgreSQL kita. Untuk mengecek apakah sudah benar, bisa klik Test Connection. Jika sudah berhasil konek, klik next. Lalu pada Select schema pilih public. Lalu klik next, kemudian klik finish. Setelah itu, database yang kita pilih akan muncul beserta table table nya.
3. Selanjutnya, kita juga harus menambahkan Connector (Driver) dari PostgreSQL dengan cara pada project MencobaDB, terdapat menu Libraries. Kita klik kanan lalu pilih Add Library… lalu kita cari PostgreSQL JDBC Driver. Jika sudah ketemu, bisa di klik lalu klik Add Library. Maka, otomatis PostgreSQL JDBC Driver akan tertambah di Libraries.
4. Selanjutnya, kita bisa buat Class baru yang akan diberi nama PertemuanEmpat. Pada Class ini, akan dituliskan perintah Select * FROM… untuk menampilkan isi data table dari database yang kita pilih.

Dengan langkah-langkah ini, Anda akan memiliki aplikasi GUI NetBeans yang dapat berkomunikasi dengan database untuk menampilkan, mengambil, dan memanipulasi data.

***
Terima kasih, semoga bermanfaat!!
> Ailsa Aurellia (09030622047)
