public class Tema2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un caracter ('a', 's', 'i', 'p', sau 'm'): ");
        char caracter = scanner.next().charAt(0);
        System.out.print("Introduceți primul număr: ");
        double numar1 = scanner.nextDouble();
        System.out.print("Introduceți al doilea număr: ");
        double numar2 = scanner.nextDouble();
        double rezultat = 0;
        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                break;
            case 's':
                rezultat = numar1 - numar2;
                break;
            case 'i':
                rezultat = numar1 * numar2;
                break;
            case 'p':
                if (numar2 != 0) {
                    rezultat = numar1 / numar2;
                } else {
                    System.out.println("Eroare: Împărțire la zero!");
                    return;
                }
                break;
            case 'm':
                rezultat = numar1 % numar2;
                break;
            default:
                System.out.println("Caracterul introdus nu este valid!");
                return;
        }
        System.out.println("Rezultatul operației este: " + rezultat);
        scanner.close();
    }
}
