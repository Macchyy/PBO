package jkt48;

class jkt{
String nama;
String born;
int tinggi;

public jkt (){

}

public jkt (String nama){
this.nama=nama;
}

public jkt (String nama, String born){
this.nama=nama;
this.born=born;
}

public jkt (String nama, String born, int tinggi){
this.nama=nama;
this.born=born;
this.tinggi=tinggi;
}

public void tampil(){

System.out.println ("-----------------JKT48----------------"); 
System.out.println ("Nama             : "+nama);
System.out.println ("Tanggal Lahir    : "+born);
System.out.println ("Tinggi Badan     : "+tinggi+"cm");
System.out.println ("--------------------------------------"); 
} 
}

class perfume{
String nama;
String born;
int tinggi;

public perfume (){

}

public perfume (String nama){
this.nama=nama;
}

public perfume (String nama, String born){
this.nama=nama;
this.born=born;
}

public perfume (String nama, String born, int tinggi){
this.nama=nama;
this.born=born;
this.tinggi=tinggi;
}

public void tampil(){

System.out.println ("---------------BABY METAL-------------");   
System.out.println ("Nama             : "+nama);
System.out.println ("Tanggal Lahir    : "+born);
System.out.println ("Tinggi Badan     : "+tinggi+"cm");
System.out.println ("--------------------------------------"); 
} 
}


public class JKT48 {
public static void main(String[] args) {
jkt A = new jkt("Flora Shafiqa","4 April 2005",149);
jkt B = new jkt("Amanda Sukma","17 Desember 2004",160);
perfume C = new perfume("Suzuka Nakamoto","20 Desember 1997",156);
perfume D = new perfume("Moa Kikuchi","4 Juli 1999",152);
A.tampil();
B.tampil();
C.tampil();
D.tampil();
}
}