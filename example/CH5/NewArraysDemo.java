import java.util.Arrays; 
 
public class NewArraysDemo { 
    public static void main(String args[]) { 
        int[][] arr1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] arr3 = {{0, 1, 3},
                        {4, 6, 4},
                        {7, 8, 9}};
 
        System.out.println("arr1 內容等於 arr2 ? " + 
                            Arrays.deepEquals(arr1, arr2));
        System.out.println("arr1 內容等於 arr3 ? " + 
                            Arrays.deepEquals(arr1, arr3));
        System.out.println("arr1 deepToString()\n\t" + 
                            Arrays.deepToString(arr1));
    } 
}