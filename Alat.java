
package alat;

import java.util.Scanner;

public class Alat {
    public String nama (String nama ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama  : ");
        nama = sc.next();
    return nama;
    }
    public String merk(String merk){
        Scanner sc = new Scanner(System.in);
        System.out.print("Merk  : ");
        merk = sc.next();
    return merk;
    }
    int hargaBeli(int harga ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Harga : ");
        harga = sc.nextInt();
    return harga;
    }
}
