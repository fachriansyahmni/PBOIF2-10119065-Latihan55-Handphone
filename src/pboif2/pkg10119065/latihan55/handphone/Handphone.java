package pboif2.pkg10119065.latihan55.handphone;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Handphone dengan objek
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct()
    {
        System.out.println("Manufakturing : "+manufacture);
        System.out.println("OS : "+ operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}
