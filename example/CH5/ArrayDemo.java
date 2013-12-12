public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];
 
        System.out.print("arr 初始值: "); 
        for(int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
            arr[i] = i; 
        }

        System.out.print("\narr 設定值: "); 
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
}