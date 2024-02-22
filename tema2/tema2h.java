 public static void main(String[] args) {
  int[] arrayIntregi = {5, 2, 9, 1, 7};
  double[] arrayCuVirgula = {3.5, 1.2, 4.8, 2.1, 6.3};

  ordoneazaCrescator(arrayIntregi);
  System.out.println("Array-ul ordonat crescător: " + Arrays.toString(arrayIntregi));

  ordoneazaDescrescator(arrayCuVirgula);
  System.out.println("Array-ul ordonat descrescător: " + Arrays.toString(arrayCuVirgula));
}
  public static void ordoneazaCrescator(int[] array) {
      Arrays.sort(array);
  }
  public static void ordoneazaCrescator(double[] array) {
      Arrays.sort(array);
  }
  public static void ordoneazaDescrescator(int[] array) {
      Arrays.sort(array);
      int lungime = array.length;
      for (int i = 0; i < lungime / 2; i++) {
          int temp = array[i];
          array[i] = array[lungime - 1 - i];
          array[lungime - 1 - i] = temp;
      }
  }
  public static void ordoneazaDescrescator(double[] array) {
      Arrays.sort(array);
      int lungime = array.length;
      for (int i = 0; i < lungime / 2; i++) {
          double temp = array[i];
          array[i] = array[lungime - 1 - i];
          array[lungime - 1 - i] = temp;
      }
  }
}
