
package matauang;
class sirdi{
   
    double dolar;
    double rupiah;
    double ringgit;
    double nilai1;
    double nilai2;
    
    public sirdi (){
       
    }
    
    public sirdi(double dlr, double rgt){
        dolar=dlr;
        ringgit=rgt;
    }
    
    private double dolar_rupiah(){
        rupiah=15000;
        nilai1=dolar*rupiah;
        return dolar;
    }
    
    private double rupiah_ringgit(){
        rupiah=4000;
        nilai2=ringgit*rupiah;
        return ringgit;
    }
    
   
    
    public void tampil(){
        dolar=dolar_rupiah();
        ringgit=rupiah_ringgit();
        
        System.out.println(" Dolar ke Rupiah = Rp " +nilai1);
       
        System.out.println(" Ringgit ke Rupiah = Rp " +nilai2);
        
    }
}


public class MATAUANG {
    
    public static void main(String[] args) {
       sirdi zunis=new sirdi(2,4);
       zunis.tampil();
       
    
    }
    
}
