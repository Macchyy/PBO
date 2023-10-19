package jkt48;

class idol {
 String nama;
 String born;
 String goldar;
 String zdk;
 String tinggi;

}

public class JKT48 {
    public static void main(String[] args) {
         
        idol flora = new idol(); 
        idol manda = new idol();
        
       flora.nama = "Flora Shafiqa";
       flora.born = "4 April 2005";
       flora.goldar = "B";
       flora.zdk = "Aries";
       flora.tinggi = "149cm";
       
       manda.nama = "Amanda Sukma";
       manda.born = "17 Desember 2004";
       manda.goldar = "O";
       manda.zdk = "Sagitarius";
       manda.tinggi = "160cm";
       
       System.out.println("objek member jkt48 (objek 1) : " );
       System.out.println("Nama : " + flora.nama);
       System.out.println("Tanggal Lahir : " + flora.born);
       System.out.println("Golongan Darah : " + flora.goldar);
       System.out.println("Horoskop : " + flora.zdk);
       System.out.println("Tinggi Badan : " + flora.tinggi + "\n");
       
       System.out.println("objek member jkt48 (objek 2) : " );
       System.out.println("Nama : " + manda.nama);
       System.out.println("Tanggal Lahir : " + manda.born);
       System.out.println("Golongan Darah : " + manda.goldar );
       System.out.println("Horoskop : " + manda.zdk);
       System.out.println("Tinggi Badan : " + manda.tinggi + "\n");
    }
    
}
