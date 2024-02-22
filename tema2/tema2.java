public class Tema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int numarIntrodus = scanner.nextInt();
       Random random = new Random();
        int numarRandom = random.nextInt(100) + 1;
        if (numarIntrodus < numarRandom) {
            System.out.println("Numărul introdus este mai mic decât " + numarRandom + ".");
        }

        scanner.close();
    }
}
