package pboif2.pkg10119065.latihan55.handphone;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Handphone dengan objek
 */
public class PBOIF210119065Latihan55Handphone {
    
    public static void main(String[] args) {
        Android android1 = new Android("Samsung", "Android", "Grand", 3000000);
        android1.displayProduct();
        android1.setKeyStroke("234ibfd3840fo");
        System.out.println("Android Key Stroke : "+android1.getKeuStroke());
        System.out.println("");
        
        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.displayProduct();
        blackBerry.setPinBB("BHS249");
        System.out.println("PIN : "+blackBerry.getPinBB());
        System.out.println("");
        
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.displayProduct();
        windowsPhone.setWpKeyStroke("UUUQIJWORJ");
        System.out.println("Wp Key Store : "+windowsPhone.getWpKeyStroke());
        System.out.println("");
        
    }
    
}
