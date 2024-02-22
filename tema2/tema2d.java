  public static void main(String[] args) {
        double[] arrayDeValori = {3.2, 4.5, 6.7, 8.9, 5.4};
        System.out.println("Elementele din array și mesajele corespunzătoare:");
        for (int i = 0; i < arrayDeValori.length; i++) {
            if (arrayDeValori[i] == 4.5) {
                System.out.println("Elementul " + arrayDeValori[i] + " este egal cu 4.5.");
            }
            if (arrayDeValori[i] > 5) {
                System.out.println("Elementul " + arrayDeValori[i] + " este peste 5.");
            }
        }
    }
}