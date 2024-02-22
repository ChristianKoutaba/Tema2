public static void main(String[] args) {
  int[][] arrayBidimensional = {
          {1, 2, 3},
          {4, 5, 6, 7, 8}
  };
  System.out.println("Primele si ultimele elemente din fiecare dimensiune:");
  for (int i = 0; i < arrayBidimensional.length; i++) {
      System.out.println("Dimensiunea " + (i + 1) + ":");
      System.out.println("Primul element: " + arrayBidimensional[i][0]);
      System.out.println("Ultimul element: " + arrayBidimensional[i][arrayBidimensional[i].length - 1]);
  }
}
}