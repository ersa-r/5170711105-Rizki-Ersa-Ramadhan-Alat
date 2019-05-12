package alat;

import java.util.Scanner;

public class Latihan {

    
        static AlatMandi a = new AlatMandi();
        static AlatTulis b = new AlatTulis();
        static AlatKesehatan c = new AlatKesehatan();
        static String nama,merk,wujud,warna,fungsi,jenis,manfaat,dimensi;
        static int harga;
        
         
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Masukan jumlah alat : ");
        int jum = sc.nextInt();
        System.out.println("Masukan jenis Alat : ");
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Tulis");
        System.out.println("3. Alat Kesehatan");
        System.out.print("Masukan Pilihan : ");
        int pil = sc.nextInt();
        switch (pil) {
            case 1:
                for (int i = 0; i < jum; i++) {
                  nama = a.nama(nama);
                  merk = a.merk(merk);
                  harga = a.hargaBeli(harga);
                  wujud = a.wujud(wujud);
                  warna = a.warna(warna);
                  System.out.println("----");
                  System.out.println("Nama  : "+nama);
                  System.out.println("Harga : "+harga);
                  System.out.println("Merk  : "+merk);
                  System.out.println("Wujud : "+wujud);
                  System.out.println("Warna : "+warna);
                  System.out.println("");
                }break;
                
               
            case 2:
                for (int i = 0; i < jum; i++) {
                  nama = b.nama(nama);
                  merk = b.merk(merk);
                  harga = b.hargaBeli(harga);
                  fungsi = b.fungsi(fungsi);
                  dimensi = b.dimensi(dimensi);
                  System.out.println("----");
                  System.out.println("Nama  : "+nama);
                  System.out.println("Harga : "+harga);
                  System.out.println("Merk  : "+merk);
                  System.out.println("Fungsi : "+fungsi);
                  System.out.println("Dimensi : "+dimensi);
                  System.out.println(""); 
                }
                break;
            case 3:
                for (int i = 0; i < jum; i++) {
                  nama = c.nama(nama);
                  merk = c.merk(merk);
                  harga = c.hargaBeli(harga);
                  jenis = c.jenis(jenis);
                  manfaat = c.manfaat(manfaat);
                  System.out.println("----");
                  System.out.println("Nama  : "+nama);
                  System.out.println("Harga : "+harga);
                  System.out.println("Merk  : "+merk);
                  System.out.println("Fungsi : "+jenis);
                  System.out.println("Dimensi : "+manfaat);
                  System.out.println(""); 
                } 
                }

        }

    }


