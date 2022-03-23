import java.util.Scanner; 

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXRepeat {
/**
    Nim : 13020200010
    Nama : Andi Rahmat Fauzy. AM
    Hari,Tanggal : Rabu, 16 Maret 2022
*/
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in); 
        /* Program */

        System.out.print ("Masukkan nilai x (int), akhiri dg if (x == 
        999){
         = masukan.nextInt(); /* First Elmt */
    System.out.print("Kasus kosong \n");
    }else { /* MInimal ada satu data yang dijumlahkan
    Sum = 0; /* Inisialisasi; invariant !! */ do{
    Sum = Sum + x; /* Proses */
    System.out.print ("Masukkan nilai x (int), akhiri
    dg 999 : ");
    } while (x != 999); /* Kondisi pengulangan */
    999 : ");
    */
    x = masukan.nextInt();  /* Next Elmt */
    
    System.out.println ("Hasil penjumlahan = "+Sum); /* Terminasi */
    } }
    }