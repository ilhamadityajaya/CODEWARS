
import java.util.Arrays;


public class kata {
     public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, -2, 3, -4, 5};
        System.out.println("Inverted array1:" + Arrays.toString(invert(array1)));
        System.out.println("Inverted array2" + Arrays.toString(invert(array2)));
    }
}


