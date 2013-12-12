public class AdvancedArray2 { 
    public static void main(String[] args) { 
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {5, 6, 7}; 
        int[] tmp = arr1;
 
        System.out.print("使用tmp取出arr1中的元素：");
        for(int i = 0; i < tmp.length; i++) 
            System.out.print(tmp[i] + " "); 
 
        tmp = arr2; 
        System.out.print("\n使用tmp取出arr2中的元素：");
        for(int i = 0; i < tmp.length; i++) 
            System.out.print(tmp[i] + " "); 
        System.out.println();
    } 
} 