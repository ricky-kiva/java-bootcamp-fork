public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = (rows-1); i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.println("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
