package pboif2.pkg10119065.latihan55.handphone;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Handphone dengan objek
 */
public class WindowsPhone extends Handphone{
    private String wpKeyStroke;

    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getWpKeyStroke() {
        return wpKeyStroke;
    }
    public void setWpKeyStroke(String wpKeyStroke)
    {
        this.wpKeyStroke = wpKeyStroke;
    }
}
