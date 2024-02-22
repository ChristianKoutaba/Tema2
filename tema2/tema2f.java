  public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        int suma = 0;
        for (int element : lista) {
            suma += element;
        }
        System.out.println("Suma tuturor elementelor din lista este: " + suma);
    }
}