
package alat;

import java.util.Scanner;

public class AlatKesehatan extends Alat {
    public String jenis (String jenis){
        Scanner sc = new Scanner(System.in);
        System.out.print("Jenis : ");
        jenis = sc.next();
    return jenis;
    }
    public String manfaat (String manfaat){
        Scanner sc = new Scanner(System.in);
        System.out.print("Manfaat : ");
        manfaat = sc.next();
    return manfaat;
    }
}