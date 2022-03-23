import java.util.Scanner;
    /* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {
  /**
    Nim : 13020200010
    Nama : Andi Rahmat Fauzy. AM
    Hari,Tanggal : Rabu, 16 Maret 2022
*/
    public static void main(String[] args) { 
      
        int N;
        int i;
        Scanner masukan=new Scanner(System.in); 
        /* Program */

        System.out.print ("Nilai N >0 = "); /* Inisialisasi */ 
        N = masukan.nextInt();
        i = 1; /* First Elmt */

        System.out.print ("Print i dengan WHILE: \n"); while (i <= N) /* Kondisi pengulangan */
        { System.out.println (i); /* Proses */

        i++;  /* Next Elmt */
        };/* (i > N) */
        
    }
    
}