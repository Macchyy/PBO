import java.util.Scanner;

public class Idol {
public static void main(String[] args) {

   Scanner B = new Scanner(System.in);
    
   System.out.print("Masukkan jumlah Member     : ");
   int member = B.nextInt();
   B.nextLine();
   
    String[] nama = new String[member];
    String[] tanggallahir = new String[member];
    int[] tinggi = new int[member];
    int[] jam = new int[member];
    int[] gaji = new int[member];
    
   for (int i = 0; i < member; i++) {
   System.out.println("--------------------------------------");
   System.out.print("Masukkan Nama Anda          : ");
   nama[i] = B.nextLine(); 

   System.out.print("Masukkan Tanggal Lahir Anda : ");
   tanggallahir[i] = B.nextLine(); 
   
   System.out.print("Masukkan tinggi Anda (cm)   : ");
   tinggi[i] = B.nextInt(); 
   
   System.out.print("Masukkan Jumlah Jam Kerja   : ");
   jam[i] = B.nextInt(); 
   gaji[i] = jam[i]*50000;
   System.out.println("--------------------------------------");
   B.nextLine();

   }
   
    for (int i = 0; i < member; i++) {
   
   System.out.println("-------------BIODATA MEMBER------------");
   System.out.println("Nama          : "+nama[i]);
   System.out.println("Tanggal lahir : "+tanggallahir[i]); 
   System.out.println("Tinggi Badan  : "+tinggi[i]+"cm");
   System.out.println("Jumlah Jam    : "+jam[i]+"jam/hari" );
   System.out.println("Gaji          : "+gaji[i]);
   System.out.println("--------------------------------------");  
}
   B.close();
}

}
