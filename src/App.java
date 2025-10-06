import java.util.Scanner;
// import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Elev> elever = new ArrayList<>();
        boolean loop = true;

        Elev[] elever = new Elev[100];
        int antalRegistrerade = 0;

        while (loop) {
            System.out.println("\n Meny:");
            System.out.println("1. Lägg till elev info");
            System.out.println("2. Visa alla elevernas information (lol din creep)");
            System.out.println("3. Avlsut program");

            int val;
            try {
                val = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(" Du måste skriva ett nummer (1-3), eller så gick något annat fel.");
                scanner.nextLine();
                continue;
            }

            if (val == 3) {
                System.out.println("Programmet stängs ned");
                loop = false;
            }

            else if (val == 1) {
                if (antalRegistrerade >=100) {
                    System.out.println("Max antal elever (100) har redan registrerats!"); // Ifall att någon har faktiskt fixat flera än 100 elever
                    continue;
                }
                System.out.println("\nRegistrerar en elev");

                System.out.print("Ditt namn: ");
                String namn = scanner.nextLine();

                String personNum = scanner.nextLine();
                System.out.print("Ditt personnummer: ");

                String mail = scanner.nextLine();
                System.out.print("Din mail: ");

                String mobilNum = scanner.nextLine();
                System.out.print("Din mobil nummer: ");

                String klass = scanner.nextLine();
                System.out.print("Din klass: ");

                String program = scanner.nextLine();
                System.out.print("Ditt program: ");

                elever[antalRegistrerade] = new Elev(namn, personNum, mail, mobilNum, klass, program);
                antalRegistrerade++;

                System.out.println("Eleven är registrerad");
            } else if (val == 2) {
                if (antalRegistrerade == 0) {
                    System.out.println("Det finns inga elever registrerade lmao :P");
                } else {
                    System.out.println("\n Alla eleverna:");
                    for (int i = 0; i < antalRegistrerade; i++) {
                        elever[i].skrivUtInfo();
                    }
                }
            } else {
                System.out.println("Ogiltigt val, välj mellan 1-3");
                continue;
            }
        }
        scanner.close();
    }
}
