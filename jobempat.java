import java.util.Scanner;

class jobempat {
public static void main(String[] args) {
   Scanner A = new Scanner(System.in);
   //Scanner B = new Scanner(System.in);
   
   
   
   System.out.println("----------------------------------- ");
   
   System.out.print("Nama               : ");
   String nama = A.nextLine();
   
   System.out.print("Tanggal Lahir      : ");
   String ttl = A.nextLine(); 

   System.out.print("Tinggi badan (cm)  : ");
   double tinggi = A.nextDouble(); 
   
   System.out.println("----------------------------------- ");

  
   A.close();

  
}

}

