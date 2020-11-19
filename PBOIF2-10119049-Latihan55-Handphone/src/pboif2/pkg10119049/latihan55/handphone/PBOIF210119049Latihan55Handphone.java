package pboif2.pkg10119049.latihan55.handphone;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Memunculkan Informasi Setiap di OS di Smartphone
**/
import Handphone.BlackBerry;
import Handphone.Android;
import Handphone.WindowsPhone;

public class PBOIF210119049Latihan55Handphone {
    public static void main(String[] args) {
        
        //android object
        Android ad1 = new Android("Samsung","Android","Grand",3000000);
        ad1.setKeyStore("234ibfd3840fo");
        ad1.displayProduct();
        System.out.printf("Android Key Store : %s\n\n",ad1.getKeyStore());
        
        //blackBerry object
        BlackBerry bb1 = new BlackBerry("BlackB","RIM","Curve",2000000);
        bb1.setPinBB("BHS249");
        bb1.displayProduct();
        System.out.printf("PIN : %s\n\n",bb1.getPinBB());
        
        WindowsPhone wp1 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        wp1.setWpKeyStore("UUUQIJWORJ");
        wp1.displayProduct();
        System.out.printf("PIN : %s\n",wp1.getWpKeyStore());
    }
    
}
