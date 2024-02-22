public static void main(String[] args) {
  char[] arrayDeCaractere = {'a', 'b', 'c', 'd', 'e'};
  System.out.println("Al doilea caracter din fiecare șir:");
  for (int i = 0; i < arrayDeCaractere.length; i++) {
      if (i % 2 != 0) {
          System.out.println("Al doilea caracter din șirul de pe poziția " + i + ": " + arrayDeCaractere[i]);
      }
  }
}
}
