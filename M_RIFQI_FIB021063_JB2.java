class id {
 String nama;
 String ttl;
 int tinggi;
 int gaji;
 int jam;
 
 public void Display(){
   System.out.println("--------------------------------------");
   System.out.println("Nama          : "+nama);
   System.out.println("Tanggal lahir : "+ttl); 
   System.out.println("Tinggi Badan  : "+tinggi);
   System.out.println("Jam Tampil    : "+jam);
   System.out.println("Gaji          : "+gaji);
   System.out.println("--------------------------------------"); 
 
 
 }
}

public class jobdua {
public static void main(String[] args) {
        id A = new id();

   A.nama = "Angelina Christy";
   A.ttl = "5 Desember 2005";
   A.tinggi = 163;
   A.jam=8;
   A.gaji=500000;
   A.Display();
   
       id B = new id();
    B.nama = "Freya Jayawardana";
    B.ttl = "13 Februari 2006";
    B.tinggi = 154;
    B.jam=8;
    B.gaji=500000;
    B.Display();
   
  
}
}



