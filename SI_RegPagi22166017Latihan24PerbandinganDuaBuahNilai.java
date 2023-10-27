import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan perbandingan dua buah nilai yang inoutannya
 * berasal dari user
 */
public class SI_RegPagi22166017Latihan24PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        // scanner
        Scanner input= new Scanner(System.in);
       // deklarasi variabel
       String ulangi;
        
        System.out.println("=========== Program Perbandingan Nilai ===========");
        // input nilai
        do{
        System.out.print("Masukkan Nilai pertama : ");
        double nilai1=input.nextDouble();
        System.out.print("Masukkan Nilai kedua : ");
        double nilai2=input.nextDouble();
        
        // pengkondisian dua nilai
        if(nilai1 > nilai2){
            System.out.println("Hasil : "+nilai1 +" Lebih besar dari "+nilai2);
        } else if (nilai1 < nilai2){
            System.out.println("Hasil : "+nilai1+" Lebih kecil dari "+nilai2);
        } else {
            System.out.println("Hasil : "+nilai1+" Sama dengan "+nilai2);
        }
        // kondisi untuk mengulangi aktifitas atau tidak
            System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
            ulangi= input.next();
            
        } while (ulangi.equalsIgnoreCase("ya"));
        System.out.println("(Developed by: Silky Afina Saly)");
        
        
        


        
    }
    
}
