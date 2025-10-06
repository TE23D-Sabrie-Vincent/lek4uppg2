import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Elev> elever = new ArrayList<>();
        boolean loop = true;

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

            if (val == 1) {
                System.out.println("\nRegistrerar en elev");

                System.out.print("Ditt namn: ");
                String namn = scanner.nextLine();

                String personNum = scanner.nextLine();
                System.out.print("Ditt personnummer: ");

                // if (personNum.length() != 8) {
                // System.out.println("Ogiltigt personnummer, det ska finnas 8 nummer
                // (ÅÅÅÅMMDD)");
                // continue;
                // }
                String mail = scanner.nextLine();
                System.out.print("Din mail: ");

                String mobilNum = scanner.nextLine();
                System.out.print("Din mobil nummer: ");

                String klass = scanner.nextLine();
                System.out.print("Din klass: ");

                String program = scanner.nextLine();
                System.out.print("Ditt program: ");

                Elev nyElev = new Elev(namn, personNum, mail, mobilNum, klass, program);
                elever.add(nyElev);

                System.out.println("Eleven är registrerad");
            } else if (val == 2) {
                if (elever.isEmpty()) {
                    System.out.println("Det finns inga elever registrerade lmao :P");
                } else {
                    System.out.println("\n Alla eleverna:");
                    for (Elev e : elever) {
                        e.skrivUtInfo();
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
