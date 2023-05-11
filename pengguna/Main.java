package pengguna;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("username", "password", "Ardila Ayu Febriana", "G.111.19.0054", 8);

        System.out.println("Username: " + mahasiswa.getUsername());
        System.out.println("Password: " + mahasiswa.getPassword());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("SMT: " + mahasiswa.getSmt());

        
        mahasiswa.setNama("Ardila Ayu Febriana");
        mahasiswa.setNim("G111190054");
        mahasiswa.setSmt(8);

        System.out.println("Nama (setelah perubahan): " + mahasiswa.getNama());
        System.out.println("NIM (setelah perubahan): " + mahasiswa.getNim());
        System.out.println("SMT (setelah perubahan): " + mahasiswa.getSmt());
    }
}
