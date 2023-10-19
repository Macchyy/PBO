class iden {
 String nama;
 String ttl;
 int tinggi;
 int jam;
 int gaji;
 
private int gajitotal(){
gaji=jam*500000;
return gaji;
}

public void tampil(){
   System.out.println("--------------------------------------");
   System.out.println("Nama          : "+nama);
   System.out.println("Tanggal lahir : "+ttl); 
   System.out.println("Tinggi Badan  : "+tinggi+" cm");
   System.out.println("Jumlah Jam    : "+jam);
   System.out.println("Jumlah Gaji   : "+gajitotal());
   System.out.println("--------------------------------------");   
}
}

public class jobtiga {
public static void main(String[] args) {
        iden A = new iden();

   A.nama = "Angelina Christy";
   A.ttl = "5 Desember 2005";
   A.tinggi = 163;
   A.jam = 8;
   A.tampil();

}
}
