public class RuntimeException1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        // System.out.println(array[5]); // e: ArrayIndexOutOfBoundsException
        System.out.println(array[2]); // only could be fixed by calling the right element
    }
}
