
package alat;

import java.util.Scanner;

public class AlatMandi extends Alat {
    public String wujud (String wujud){
        Scanner sc = new Scanner(System.in);
        System.out.print("Wujud : ");
        wujud = sc.next();
    return wujud;
    }
    public String warna (String warna){
        Scanner sc = new Scanner(System.in);
        System.out.print("Warna : ");
        warna = sc.next();
    return warna;
    }
    
}