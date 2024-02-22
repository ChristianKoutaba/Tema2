 public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println("Index valid");
        }
    }
}