import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
/**
    Nim : 13020200010
    Nama : Andi Rahmat Fauzy. AM
    Hari,Tanggal : Rabu, 16 Maret 2022
*/

class BacaString{
    public static void main(String[] args)throws IOException{
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
    /* Program */
    System.out.print ("\nBaca string dan Integer: \n");
    System.out.print("masukkan sebuah string: ");
    str= datAIn.readLine();
    System.out.print ("String yang dibaca : "+ str);
    }
}
