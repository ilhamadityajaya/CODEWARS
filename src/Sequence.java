/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;

public class Sequence {

    public static int[] reverse(int n) {
        int[] result = new int[n];
        for (int i = n; i >= 1; i--) {
            result[n - i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = reverse(n);
        System.out.println(Arrays.toString(result));
    }
}
