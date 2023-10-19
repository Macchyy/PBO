class jkt{
String nama;
String ttl;
int tinggi;

public jkt (){

}

public jkt (String nama){
this.nama=nama;
}

public jkt (String nama, String ttl){
this.nama=nama;
this.ttl=ttl;
}

public jkt (String nama, String ttl, int tinggi){
this.nama=nama;
this.ttl=ttl;
this.tinggi=tinggi;
}

public void tampil(){

System.out.println ("-----------------JKT48----------------"); 
System.out.println ("Nama             : "+nama);
System.out.println ("Tanggal Lahir    : "+ttl);
System.out.println ("Tinggi Badan     : "+tinggi+"cm");
System.out.println ("--------------------------------------"); 
} 
}

class perfume{
String nama;
String ttl;
int tinggi;

public perfume (){

}

public perfume (String nama){
this.nama=nama;
}

public perfume (String nama, String ttl){
this.nama=nama;
this.ttl=ttl;
}

public perfume (String nama, String ttl, int tinggi){
this.nama=nama;
this.ttl=ttl;
this.tinggi=tinggi;
}

public void tampil(){

System.out.println ("-------------IDOL BABY METAL----------");   
System.out.println ("Nama             : "+nama);
System.out.println ("Tanggal Lahir    : "+ttl);
System.out.println ("Tinggi Badan     : "+tinggi+"cm");
System.out.println ("--------------------------------------"); 
} 
}


public class joblima {
public static void main(String[] args) {
jkt A = new jkt("Angelina Christy","5 Desember 2005",163);
jkt B = new jkt("Freya Jayawardana","13 Februari 2006",154);
perfume C = new perfume("Suzuka Nakamoto","20 Desember 1997",156);
perfume D = new perfume("Moa Kikuchi","4 Juli 1999",152);
A.tampil();
B.tampil();
C.tampil();
D.tampil();
}
}
