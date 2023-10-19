class identitas {
 String nama;
 String ttl;
 int tinggi;
 int gaji;
 int jam;
 
}

public class jobsatu {
public static void main(String[] args) {
        identitas A = new identitas();

   A.nama = "Angelina Christy";
   A.ttl = "5 Desember 2005";
   A.tinggi = 163;
   
   System.out.println("--------------------------------------");
   System.out.println("Nama          : "+A.nama);
   System.out.println("Tanggal lahir : "+A.ttl); 
   System.out.println("Tinggi Badan  : "+A.tinggi);
   System.out.println("--------------------------------------");   
}
}


