
package alat;

import java.util.Scanner;

public class AlatTulis extends Alat {
    public String fungsi (String fungsi){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fungsi : ");
        fungsi = sc.next();
    return fungsi;
    }
    public String dimensi(String dimensi){
        String p,l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensi p = ");
        p = sc.next();
        System.out.print("      & l = ");
        l = sc.next();
        dimensi = "p = "+p+" & l = "+l;
    return dimensi;
    
    }

    
    
}