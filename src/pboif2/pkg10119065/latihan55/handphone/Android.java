package pboif2.pkg10119065.latihan55.handphone;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Handphone dengan objek
 */
public class Android extends Handphone{
    private String keuStroke;
    
    public Android(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getKeuStroke() {
        return keuStroke;
    }
    public void setKeyStroke(String keyStroke)
    {
        this.keuStroke = keyStroke;
    }
}
