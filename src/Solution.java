/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Solution {
    public static int areaOrPerimeter(int length, int width) {
        if (length == width) {
            return length * length;
        }else {
            
            return 2 * (length + width);
            
        }
    }
    public static void main(String[] args) {
        int length1 = 6;
        int width1 = 10;
        int result1 = areaOrPerimeter(length1, width1);
        System.out.println("Output: " + result1);
        
        int length2 = 3; 
        int width2 = 3;
        int result2 =areaOrPerimeter(length2, width2 );
        System.out.println("Output: " + result2);

    }
    
}
