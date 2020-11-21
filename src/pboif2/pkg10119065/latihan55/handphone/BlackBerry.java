
package pboif2.pkg10119065.latihan55.handphone;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Handphone dengan objek
 */
public class BlackBerry extends Handphone{
    private String pinBB;

    public BlackBerry(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }
    public void setPinBB(String pinBB)
    {
        this.pinBB = pinBB;
    }
}
