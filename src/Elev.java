public class Elev {
    String namn;
    String personnummer;
    String email;
    String mobilnummer;
    String klass;
    String program;

    public Elev(String namn, String personnummer, String email,
                String mobilnummer, String klass, String program) {
        this.namn = namn;
        this.personnummer = personnummer;
        this.email = email;
        this.mobilnummer = mobilnummer;
        this.klass = klass;
        this.program = program;
    }

    public void skrivUtInfo() {
        System.out.println("\n--- Elev registrerad ---");
        System.out.println("Namn: " + namn);
        System.out.println("Personnummer: " + personnummer);
        System.out.println("Email: " + email);
        System.out.println("Mobilnummer: " + mobilnummer);
        System.out.println("Klass: " + klass);
        System.out.println("Program: " + program);
    }
}
