
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array1 = {34, 15, 88, 2};
        int[] array2 = {34, -345, -1, 100};
        System.out.println("smallest integer in array1" + findSmallestInt(array1));
        System.out.println("smallest integer in array2" + findSmallestInt(array2));
    }
}
