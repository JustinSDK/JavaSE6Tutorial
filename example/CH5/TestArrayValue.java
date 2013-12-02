public class TestArrayValue {
    public static void main(String[] args) { 
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
 
        int[] tmp = arr1;
 
        System.out.println(arr1 == tmp); 
        System.out.println(arr2 == tmp); 
    }    
}