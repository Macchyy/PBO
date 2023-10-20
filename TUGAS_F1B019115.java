package tugasp1;

class pencatatcatatan{
    String judulcatatan;
    String isicatatan;
}

public class Tugasp1 {
    public static void main(String[] args) {
       
        pencatatcatatan A = new pencatatcatatan();
        
        A.judulcatatan = "Praktikum P SATU";
        A.isicatatan = "hari rabu adalah jadwal praktikum PBO percobaan satu yang kemudian "
                + "diminta untuk mengerjakan jobsheet dan tugas tambahan secra individu dan berkelompok";
    
        System.out.println("************CATATAN HARI RABU**************");
        System.out.println("JudulCatatan          : "+A.judulcatatan);
        System.out.println("IsiCatatan            : "+A.isicatatan); 
        System.out.println("*******************************************");  
    }
    
}
