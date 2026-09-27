public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pengujian BujurSangkar ===");
        BujurSangkar kotak = new BujurSangkar(5.0, "Merah");
        kotak.printInfo();

        System.out.println("\n=== Pengujian Lingkaran ===");
        Lingkaran bulat = new Lingkaran(7.0, "Biru");
        bulat.printInfo();

        System.out.println("\n=== Pengujian Silinder ===");
        Silinder tabung = new Silinder(10.0, 7.0, "Kuning");
        tabung.printInfo();
    }
}
