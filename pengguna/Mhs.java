package pengguna;

public class Mhs extends User {
    private String nama;
    private String nim;
    private int smt;

    public Mhs(String username, String password, String nama, String nim, int smt) {
        super(username, password);
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSmt() {
        return this.smt;
    }

    public void setSmt(int smt) {
        this.smt = smt;
    }
}
