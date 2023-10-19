package jkt48;

class idol {
 String nama;
 String born;
 String goldar;
 String zdk;
 String tinggi;
 int gaji;
 int show;

private int gajitotal(){
gaji=show*500000;
return gaji;
}

public void tampil(){
    System.out.println("objek member jkt48 (objek 1) : " );
    System.out.println("Nama : " + nama);
    System.out.println("Tanggal Lahir : " + born);
    System.out.println("Golongan Darah : " + goldar);
    System.out.println("Horoskop : " + nama);
    System.out.println("Tinggi Badan : " + tinggi );
    System.out.println("Jumlah show    : "+show);
    System.out.println("Jumlah Gaji   : "+gajitotal());
    System.out.println("--------------------------------------");   
}
}

public class JKT48 {
    public static void main(String[] args) {
         
        idol flora = new idol(); 
        
       flora.nama = "Flora Shafiqa";
       flora.born = "4 April 2005";
       flora.goldar = "B";
       flora.zdk = "Aries";
       flora.tinggi = "149cm";
       flora.show = 10;
       flora.tampil();
    }
    
}
