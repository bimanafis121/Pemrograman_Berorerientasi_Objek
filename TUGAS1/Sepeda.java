public class Sepeda {
     // Atribut
     private String merek;
     private String model;
     private String warna;
     private String ukuranRoda;
     private int jumlahGigi;
     private double berat;
     private String kondisi;
 
     // Konstruktor
     public Sepeda(String merek, String model, String warna, String ukuranRoda, int jumlahGigi, double berat, String kondisi) {
         this.merek = merek;
         this.model = model;
         this.warna = warna;
         this.ukuranRoda = ukuranRoda;
         this.jumlahGigi = jumlahGigi;
         this.berat = berat;
         this.kondisi = kondisi;
     }
 
     // Metode untuk mengayuh sepeda
     public void mengayuh() {
         System.out.println(merek + " " + model + " sedang dikayuh.");
     }
 
     // Metode untuk rem sepeda
     public void rem() {
         System.out.println(merek + " " + model + " berhenti.");
     }
 
     // Metode untuk belok
     public void belok(String arah) {
         System.out.println(merek + " " + model + " belok ke " + arah + ".");
     }
 
     // Metode untuk mengganti gigi
     public void gantiGigi(int gigi) {
         if (gigi <= jumlahGigi) {
             System.out.println("Gigi diganti ke " + gigi + ".");
         } else {
             System.out.println("Gigi tidak tersedia.");
         }
     }
 
     // Metode untuk cek kondisi
     public void cekKondisi() {
         System.out.println("Kondisi sepeda: " + kondisi);
     }
 
     // Metode untuk menampilkan informasi sepeda
     public void tampilkanInfo() {
         System.out.println("Sepeda: " + merek + " " + model + ", Warna: " + warna + ", Ukuran Roda: " + ukuranRoda +
                 ", Jumlah Gigi: " + jumlahGigi + ", Berat: " + berat + " kg, Kondisi: " + kondisi);
     }
 
     // Main method untuk contoh penggunaan
     public static void main(String[] args) {
         Sepeda sepeda1 = new Sepeda("Trek", "Mountain Bike", "Merah", "29 inci", 21, 12.5, "Baru");
         sepeda1.tampilkanInfo();
         sepeda1.mengayuh();
         sepeda1.belok("kiri");
         sepeda1.gantiGigi(3);
         sepeda1.cekKondisi();
     }
 }
