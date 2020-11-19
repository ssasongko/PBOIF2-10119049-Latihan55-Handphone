package Handphone;
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.printf("Manufaktur : %s\n",manufacture);
        System.out.printf("OS : %s\n",operatingSystem);
        System.out.printf("Model : %s\n",model);
        System.out.printf("Harga : %d\n",harga);
    }
    
    
}
