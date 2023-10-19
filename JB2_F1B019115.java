
package praktikum1;

class Pelapor {
 String nama;
 String nik;
 String laporan;
 String nohp;
 String umur;
}
public class Praktikum1 {
    public static void main(String[] args) {
        
    Pelapor bambang = new Pelapor ();
    Pelapor sukri = new Pelapor();

 bambang.nama = "Bambang Sujiantoro";
 bambang.nik = "520414501120";
 bambang.laporan = "gaji tidak sesuai";
 bambang.nohp = "087456688006";
 bambang.umur = "20";
 
 sukri.nama = "Sukri Ganteng";
 sukri.nik = "5204176675545";
 sukri.laporan = "kebanyakan disuruh kerja lembur";
 sukri.nohp = "087534423889";
 sukri.umur = "42";
 
System.out.println("objek pelapor (1) : " );
       System.out.println("Nama : " + bambang.nama);
       System.out.println("NIK : " + bambang.nik);
       System.out.println("Laporan : " + bambang.laporan);
       System.out.println("NoHp : " + bambang.nohp);
       System.out.println("Umur : " + bambang.umur + "\n");
       
       System.out.println("objek pelapor (2) : " );
       System.out.println("Nama : " + sukri.nama);
       System.out.println("NIK : " + sukri.nik);
       System.out.println("Laporan : " + sukri.laporan);
       System.out.println("NoHp : " + sukri.nohp);
       System.out.println("Umur : " + sukri.umur + "\n");
    }
    
}

 
