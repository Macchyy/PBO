package praktikum1;

class pelapor{
String nama;
String nohp;
String laporan;

public pelapor (){

}

public pelapor (String nama){
this.nama=nama;
}

public pelapor (String nama, String nohp){
this.nama=nama;
this.nohp=nohp;
}

public pelapor (String nama, String nohp, String laporan){
this.nama=nama;
this.nohp=nohp;
this.laporan=laporan;
}

public void tampil(){

System.out.println ("-----------------PENGADUAN PEGAWAI----------------"); 
System.out.println ("Nama             : "+nama);
System.out.println ("NoHp             : "+nohp);
System.out.println ("Laporan          : "+laporan);
System.out.println ("------------------------------------------"); 
} 
}

class kasus{
String nama;
String nohp;
String laporan;;

public kasus (){

}

public kasus (String nama){
this.nama=nama;
}

public kasus (String nama, String nohp){
this.nama=nama;
this.nohp=nohp;
}

public kasus (String nama, String nohp, String laporan){
this.nama=nama;
this.nohp=nohp;
this.laporan=laporan;
}

public void tampil(){

System.out.println ("---------------LAPORAN KASUS-------------");   
System.out.println ("Nama             : "+nama);
System.out.println ("NoHp             : "+nohp);
System.out.println ("Laporan          : "+laporan);
System.out.println ("--------------------------------------"); 
} 
}


public class Praktikum1 {
public static void main(String[] args) {
pelapor A = new pelapor("Sahabuddin","08766564433","Tidak di Gaji Selama Dua Bulan");
pelapor B = new pelapor("Sirajuddin","99088976654","Sering Di Bully Teman Sekantor");
kasus C = new kasus("Adi Sucipto","989968756445","merokok didalam ruangan ber AC");
kasus D = new kasus("Supratman","0998897876","Sering Membully Pegawai Lain Di Kantor");
A.tampil();
B.tampil();
C.tampil();
D.tampil();
}
}
